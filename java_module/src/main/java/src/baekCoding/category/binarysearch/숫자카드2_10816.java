package src.baekCoding.category.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

// TODO: Sample 예시는 맞췄지만,,, 틀렸다
// 정석풀이는 lowerBound, upperBound 로 풀이하는것이라네?
public class 숫자카드2_10816 {

    static int n;
    static int[] arr;
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            System.out.print(binarySearch(target) + " ");
        }
        br.close();
    }

    private static int binarySearch(int target) {
        int left = 0;
        int right = n-1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = arr[mid];

            if(midValue == target){
                // 발견 했을경우 탐색 범위를 넓혀서(왼쪽++, 오른쪽++) 같은값을 찾아야 함.

                int count = 1; // mid 위치값 포함
                int i = mid - 1; // mid 왼쪽
                while (i >= 0 && arr[i] == target){
                    count++;
                    i--;
                }

                int j = mid + 1; // mid의 오른쪽 확인
                while (j < n && arr[j] == target) {
                    count++;
                    j++;
                }

                map.put(target, map.getOrDefault(target, 0) + count);
                return map.get(target);
            }

            if(target < midValue){
                right = mid -1;
            }else if(target > midValue){
                left = mid + 1;
            }
        }

        return 0;
    }
}

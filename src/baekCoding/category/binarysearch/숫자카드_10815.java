package baekCoding.category.binarysearch;

// S5 - 이분탐색
// 4줄 기준 비교

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드_10815 {

    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            // 이분탐색 시작. 각 값은 저장할 필요없음 -> 비교만 하기위함.
            int target = Integer.parseInt(st.nextToken());
            // bs
            System.out.print(binarySearch(target) + " ");
        }
        br.close();
    }

    static int binarySearch(int target) {
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = arr[mid];

            if(target == midValue) {
                return 1;
            }else if(midValue > target) { // 타겟이 중간값 보다 작다면 right 를 줄여준다. (중간값을 기준으로 왼쪽에 있다는 뜻)
                right = mid - 1;
            }else if(midValue < target) {
                left = mid + 1;
            }
        }

        return 0;
    }


    // 시간 초과
//    public static void main(String[] args) throws IOException {
//        List<Integer> list = new ArrayList<>();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            list.add(Integer.parseInt(st.nextToken()));
//        }
//
//        int m = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < m; i++) {
//            int num = Integer.parseInt(st.nextToken());
//            boolean contains = list.contains(num);
//            System.out.print(contains ? 1 + " " : 0 + " ");
//        }
//        br.close();
//    }
}

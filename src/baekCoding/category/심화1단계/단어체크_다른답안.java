package baekCoding.category.심화1단계;

import java.util.Scanner;

/**
 * 다른 사람들이 보편적으로 푸는 방식
 *  1. boolean[] 의 길이를 알파벳의 길이로 초기화 26
 *  2. 이전값 != 현재값 이고, boolean 배열에 현재값을 true 로 설정.
 *     - 이때 [current -97] 을 해주는 이유는 'a'==97 이기에 0 번 요소를 true 로 바꾸기 위함임.... 그럼 boolean 으로 해당 char 가 true,false 인지 바로 파악 가능...오
 *     - 즉 0-25 인덱스를 바로 파악할 수 있지. -> 문자열로 계산 안때려도 된다
 */
public class 단어체크_다른답안 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(check(sc.next())) count++;
        }
        sc.close();

        System.out.println(count);
    }

    public static boolean check(String s) {
        boolean[] arr = new boolean[26];
        int prev = -1;

        for (int i = 0; i < s.length(); i++) {
            int current = s.charAt(i);

            // 이전 != 현재
            if(prev != current){
                if(arr[current - 97] == false){
                    arr[current - 97] = true;
                    prev = current;
                }else {
                    return false;
                }
            }else {
                continue;
            }
        }
        return true;
    }
}

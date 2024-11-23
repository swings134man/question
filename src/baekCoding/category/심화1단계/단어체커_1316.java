package baekCoding.category.심화1단계;

import java.util.HashMap;
import java.util.Scanner;

// 첫번쨰 풀이 ....
public class 단어체커_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            String next = sc.next();
            count += check(next);
        }
        sc.close();

        System.out.println(count);
    }

    public static int check(String str) {
        char prev = str.charAt(0);
        HashMap<Character, Boolean> map = new HashMap();
        map.put(prev, true);

        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            if(prev != current){
                if(map.getOrDefault(current, false)) {
                    return 0;
                }
                map.put(current, true);
            }
            prev = current;
        }
        return 1;
    }
}


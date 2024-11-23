package baekCoding.category.심화1단계;

import java.util.*;

/**
 * solve: max 값이 존재하면 그게 답, 만약 max 값과 같은값이 존재한다? 그럼 최댓값이 같은게 있다는 소리니까 답은 "?"
 */
public class 단어공부_1157 {
    public static void main(String[] args) {
        char[] s = new Scanner(System.in).next().toUpperCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length; i++) {
            for (char j = 'A'; j <= 'Z'; j++){
                if(s[i] == j) {
                    map.put(j, map.getOrDefault(j, 0) + 1);
                }
            }
        }

        int max = 0;
        char res = ' ';
        boolean isSame = false;

        for (Map.Entry entry: map.entrySet()){
            if(max < (int)entry.getValue()){
                max = (int)entry.getValue();
                res = (char) entry.getKey();
                isSame = false;
            }else if(max == (int)entry.getValue()){
                isSame = true;
            }
        }

        System.out.println(isSame ? "?" : res);
    }
}

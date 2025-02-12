package baekCoding.category.company;

import java.io.*;
import java.util.*;

/**
 * @package : baekCoding.category.company
 * @name : 영단어_20920.java
 * @date : 2025. 2. 12. 오후 12:17
 * @author : lucaskang(swings134man)
 * @Description: S3 - 해시, 트리, 문자열, 자료구조, 정렬
 * - 자주 나오면 앞
 * - 단어가 길수록
 * - 알파벳 사전 순
**/
public class 영단어_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 단어갯수
        int m = Integer.parseInt(s[1]); // 단어길이 기준

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if(str.length() < m) continue;

            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        br.close();

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 자주 등장
                if(Integer.compare(map.get(o1), map.get(o2)) != 0) {
                    return Integer.compare(map.get(o2), map.get(o1));
                }

                // 단어가 길수록
                if(o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }


                // 알파벳 사전순
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < list.size(); i++) {
            bw.append(list.get(i)).append("\n");
        }
        bw.flush();
        bw.close();
    }//main
}

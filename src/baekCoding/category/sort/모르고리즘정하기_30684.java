package baekCoding.category.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @package : baekCoding.category.sort
 * @name : 모르고리즘정하기_30684.java
 * @date : 2025. 2. 12. 오후 4:52
 * @author : lucaskang(swings134man)
 * @Description: B4 - 정렬
**/
public class 모르고리즘정하기_30684 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if(s.length() == 3) {
                list.add(s);
            }
        }
        br.close();

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}

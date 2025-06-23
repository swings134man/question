package src.baekCoding.category.priority_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * @package : baekCoding.category.priority_queue
 * @name : 이중우선순위큐_7662.java
 * @date : 2025. 1. 25. 오후 4:40
 * @author : lucaskang(swings134man)
 * @Description: G4 - 이중우선순위큐 (TreeMap 사용하여 쉽게 구현가능)
 * - Q 에 남아있는 값중 최댓값, 최솟값 출력 (공백구분), 비어있으면 EMPTY
 * - Q 는 정수만 저장하는 자료구조?
**/
public class 이중우선순위큐_7662 {

    static int t;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            int k = Integer.parseInt(br.readLine());
            // Q 연산
            for (int j = 0; j < k; j++) {
                String[] str = br.readLine().split(" "); // [0] == D(Q 최댓값 삭제) || I(n 을 Q 에 INPUT)
                char cmd = str[0].charAt(0);
                int num = Integer.parseInt(str[1]);

                if(cmd == 'I') {
                    treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
                }else {
                    // cmd == 'D'
                    if(treeMap.isEmpty()) {
                        continue;
                    }

                    // -1 : 최솟값 삭제
                    if(num == -1) {
                        int min = treeMap.firstKey();
                        if(treeMap.get(min) == 1) {
                            treeMap.remove(min);
                        }else {
                            treeMap.put(min, treeMap.get(min) - 1);
                        }
                    }else {
                        int max = treeMap.lastKey();
                        if(treeMap.get(max) == 1) {
                            treeMap.remove(max);
                        }else {
                            treeMap.put(max, treeMap.get(max) - 1);
                        }
                    }
                }
            }//2for

            if(treeMap.isEmpty()) {
                sb.append("EMPTY");
            }else {
                sb.append(treeMap.lastKey()).append(" ").append(treeMap.firstKey());
            }
            sb.append("\n");
        }//1for
        System.out.println(sb);
    }//main
}

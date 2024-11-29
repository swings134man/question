package baekCoding.category.dfs;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * S4
 * p= n-1 각자릿수 의 ^p
 * D[n] = D[n -1] 각 자릿수^p 의 합
 *
 * ArrayList 에 각 계산된 값을 add -> indexOf 로 이미 있다면 return 하고 그 값의 index 를 출력하면 된다
 * -> 그 Index 전은 반복이 안된값이니까 37이 반복의 시작이라면, 37 = index(4) 고 갯수가 딱 맞아 떨어짐.
 */
public class 반복수열_2331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p = sc.nextInt();
        sc.close();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);

        while (true){
            // while 로 list 에 쌓인 최신값 가져와야 함.
            int temp = list.get(list.size() - 1);

            int pow = 0;
            while (temp != 0){
                pow += (int)Math.pow(temp % 10, p);
                temp /= 10;
            }

            // 이미 있다면!
            if(list.contains(pow)) {
                int i = list.indexOf(pow);
                System.out.println(i);
                break;
            }
            // 아니라면 추가
            list.add(pow);
        }
    }//main
}

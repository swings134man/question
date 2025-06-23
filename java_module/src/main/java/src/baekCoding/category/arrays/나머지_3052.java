package src.baekCoding.category.arrays;

import java.util.*;

public class 나머지_3052 {
    // First
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(sc.nextInt() % 42);
//        }
//
//        Set<Integer> set = new HashSet<>(list);
//        System.out.println(set.size());
//    }

    // Refactor
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(sc.nextInt() % 42);
        }
        System.out.println(set.size());
    }
}

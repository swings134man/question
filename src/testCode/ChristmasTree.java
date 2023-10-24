package testCode;

public class ChristmasTree {
    public static void main(String[] args) {

        System.out.println("Merry,, ChristMas!");
        // 몇줄
        for (int i = 0; i < 4; i++) {
            // 공백
            for (int j = 0; j < 3-i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("  | |   ");
        System.out.println("--------");
    }
}

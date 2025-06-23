package src.testCode;

import java.util.Arrays;

public class TestCode2 {
    public static void main(String[] args) {
        String te = "OOXXOXXOOO";
        byte[] bytes = te.getBytes();
        System.out.println("bytes = " + Arrays.toString(bytes));
        for (byte res: bytes){
            if(res == 'O'){
                System.out.println("O");
            }
        }
    }
}

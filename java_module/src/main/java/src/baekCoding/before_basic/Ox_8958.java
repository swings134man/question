package src.baekCoding.before_basic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ox_8958 {
    // 나의 풀이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            String line = br.readLine();
            int sum = 0;
            int index = 0;

            for (int j = 0; j < line.length(); j++) {
                if(line.charAt(j) == 'O'){
                    index++;
                    sum += index;
                }else {
                    index = 0;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int count = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < count; i++) {
//            int sum = 0;
//            int index =0;
//
//            for (byte res: br.readLine().getBytes()){
//                if(res == 'O')
//                    index++;
//                else
//                    index = 0;
//                sum += index;
//            }
//            sb.append(sum).append("\n");
//        }
//        System.out.println(sb);
//    }
}

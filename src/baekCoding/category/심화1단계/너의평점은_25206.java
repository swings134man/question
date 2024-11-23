package baekCoding.category.심화1단계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// (학점 * 과목점수) / 학점총합 = 답
public class 너의평점은_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0.0;
        double total = 0.0;

        for (int i = 0; i < 20; i++) {
            String[] s = br.readLine().split(" ");
            double point = Double.parseDouble(s[1]); // 학점
            String grade = s[2];

            if(!grade.equals("P")){
                total += point;
                switch (grade){
                    case "A+":
                        sum += point * 4.5;
                        break;
                    case "A0":
                        sum += point * 4.0;
                        break;
                    case "B+":
                        sum += point * 3.5;
                        break;
                    case "B0":
                        sum += point * 3.0;
                        break;
                    case "C+":
                        sum += point * 2.5;
                        break;
                    case "C0":
                        sum += point * 2.0;
                        break;
                    case "D+":
                        sum += point * 1.5;
                        break;
                    case "D0":
                        sum += point * 1.0;
                        break;
                    case "F":
                        sum += 0.0;
                        break;
                }
            }
        }

        System.out.println(sum / total);
    }
}

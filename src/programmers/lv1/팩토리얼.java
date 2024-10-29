package programmers.lv1;

public class 팩토리얼 {
    //test
    public static void main(String[] args) {
        int n =3628800;
        팩토리얼 팩토리얼 = new 팩토리얼();
        팩토리얼.solution(n);
    }
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= 10; i++) {
            if(n >= factorial(i)) {
                answer = i;
                System.out.println(answer);// test
            }else {
                break;
            }
        }

        return answer;
    }

    public int factorial(int n) {
        if(n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}

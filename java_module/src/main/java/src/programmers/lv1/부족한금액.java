package src.programmers.lv1;

public class 부족한금액 {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum += ((long) price * (i + 1));
        }

        answer = money < sum ? sum - money : 0;

        return answer;
    }

    public static void main(String[] args) {
        부족한금액 so = new 부족한금액();
        int price = 3;
        int money = 20;
        int count = 4;
        long solution = so.solution(price, money, count);
        System.out.println("solution = " + solution);
    }
}

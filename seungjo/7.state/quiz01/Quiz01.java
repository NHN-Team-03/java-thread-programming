package quiz01;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("시간 간격을 입력하세요: ");
        String interval = sc.nextLine();

        Ticker ticker = new Ticker(interval);
        ticker.run();
    }
}

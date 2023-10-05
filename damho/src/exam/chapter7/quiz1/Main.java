package damho.src.exam.chapter7.quiz1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        int sec;
        boolean isNano = false;

        while (true) {
            System.out.print("시간간격을 입력해주세요(nanoseconds를 사용할 경우 끝에 n을 입력해주세요 Ex. 1000n) : ");
            line = scanner.nextLine().trim();

            if (line.charAt(line.length() - 1) == 'n') {
                line = line.substring(0, line.length() - 1);
                isNano = true;
            }

            try {
                sec = Integer.parseInt(line);
                break;
            } catch (NumberFormatException exception) {
                System.out.println("숫자를 입력해주세요.");
            }
        }

        Ticker ticker = new Ticker(sec, isNano);
        ticker.start();

        scanner.close();
    }
}

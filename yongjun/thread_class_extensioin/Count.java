package yongjun.thread_class_extensioin;

import java.util.Scanner;

public class Count {

    int maxCount;
    String name;

    public Count(String name, int maxCount){
        this.name = name;
        this.maxCount = maxCount;
    }

    public static void main(String[] args) {
        Count counter = new Count("Counter", 10);
        counter.run();
    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);
        String name = "Count";
        int maxNum =0;
        int count = 0;
        try {
            System.out.println("숫자 입력");
            maxNum = scanner.nextInt();
        }catch (NumberFormatException e){
            System.out.println("wrong number");
        }

        for (int i = 0; i < maxNum; i++) {
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

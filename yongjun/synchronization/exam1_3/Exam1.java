package yongjun.synchronization.exam1_3;

import yongjun.synchronization.exam1_3.SharedCountStatic;
import yongjun.synchronization.exam1_3.SharedCounter;

public class Exam1 {

    public static void main(String[] args) throws InterruptedException {
        SharedCountStatic sharedCountStatic = new SharedCountStatic();
        SharedCounter counter1 = new SharedCounter("counter1", sharedCountStatic,10000);
        SharedCounter counter2 = new SharedCounter("counter2", sharedCountStatic,10000);

        counter1.start();
        counter2.start();
        System.out.println(counter1.getName() + ": started");
        System.out.println(counter2.getName() + ": started");

        counter1.join();
        counter2.join();
        System.out.println(counter1.getName() + ": terminated");
        System.out.println(counter2.getName() + ": terminated");

        System.out.println("sharedCount : " + sharedCountStatic.getCount());
    }

}


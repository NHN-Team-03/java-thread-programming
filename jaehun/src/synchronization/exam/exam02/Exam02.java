package synchronization.exam.exam02;

import synchronization.exam.exam01.SharedCount;
import synchronization.exam.exam01.SharedCounter;

public class Exam02 {
    public static void main(String[] args) throws InterruptedException {
        SharedCount sc = new SharedCount();

        SharedCounter counter1 = new SharedCounter("counter1", 50000, sc);
        SharedCounter counter2 = new SharedCounter("counter2", 50000, sc);

        counter1.start();
        counter2.start();

        System.out.println(counter1.getName() + ": started");
        System.out.println(counter2.getName() + ": started");

        counter1.join();
        counter2.join();

        System.out.println(counter1.getName() + ": terminated");
        System.out.println(counter2.getName() + ": terminated");

        System.out.println(sc.getCount());
    }
}

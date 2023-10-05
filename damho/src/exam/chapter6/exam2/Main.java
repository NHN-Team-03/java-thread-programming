package damho.src.exam.chapter6.exam2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedCount sharedCount = new SharedCount(0);
        SharedCounter sharedCounter1 = new SharedCounter("SharedCounter1", 10000, sharedCount);
        SharedCounter sharedCounter2 = new SharedCounter("SharedCounter2", 10000, sharedCount);

        sharedCounter1.start();
        sharedCounter2.start();

        System.out.println(sharedCounter1.getName() + ": started");
        System.out.println(sharedCounter2.getName() + ": started");

        sharedCounter1.join();
        sharedCounter2.join();

        System.out.println(sharedCounter1.getName() + ": terminated");
        System.out.println(sharedCounter2.getName() + ": terminated");

        System.out.println(sharedCount.getCount());
    }
}

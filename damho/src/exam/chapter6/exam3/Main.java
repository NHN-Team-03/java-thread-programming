package damho.src.exam.chapter6.exam3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter sharedCounter1 = new SharedCounter("SharedCounter1", 10000);
        SharedCounter sharedCounter2 = new SharedCounter("SharedCounter2", 10000);

        sharedCounter1.start();
        sharedCounter2.start();

        System.out.println(sharedCounter1.getName() + ": started");
        System.out.println(sharedCounter2.getName() + ": started");

        sharedCounter1.join();
        sharedCounter2.join();

        System.out.println(sharedCounter1.getName() + ": terminated");
        System.out.println(sharedCounter2.getName() + ": terminated");

        System.out.println(SharedCount.getCount());
    }
}

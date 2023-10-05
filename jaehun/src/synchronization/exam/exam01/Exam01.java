package synchronization.exam.exam01;

public class Exam01 {
    public static void main(String[] args) throws InterruptedException {
        SharedCount sc = new SharedCount();
        SharedCounter counter1 = new SharedCounter("counter1", 500000, sc);
        SharedCounter counter2 = new SharedCounter("counter2", 500000, sc);

        counter1.start();
        counter2.start();

        counter1.join();
        counter2.join();

        System.out.println(sc.getCount());
    }
}

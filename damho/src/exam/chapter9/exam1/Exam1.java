package damho.src.exam.chapter9.exam1;

public class Exam1 {

    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter("counter1", 100);
        Counter counter2 = new Counter("counter2", 100);

        counter1.setDaemon(true);

        counter1.start();
        counter2.start();

        Thread.sleep((5000));
        counter2.thread.interrupt();

        System.out.println("main 종료");
    }
}

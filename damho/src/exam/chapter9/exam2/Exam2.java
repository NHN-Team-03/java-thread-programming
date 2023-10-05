package damho.src.exam.chapter9.exam2;

public class Exam2 {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker("worker1", 100);

        worker.start();

        Thread.sleep(5000);
        worker.stop();

        System.out.println("main 종료");
    }
}
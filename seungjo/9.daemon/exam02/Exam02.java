package exam02;

public class Exam02 {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker("worker1", 100);
        worker.start();

        Thread.sleep(5000);
        worker.stop();

        Thread.sleep(2000);

        System.out.println("Main Thread terminated");
    }
}

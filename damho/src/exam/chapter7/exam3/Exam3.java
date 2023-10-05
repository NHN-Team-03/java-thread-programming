package damho.src.exam.chapter7.exam3;

public class Exam3 {
    public static void main(String[] args) throws InterruptedException {
        SharedCount sharedCount = new SharedCount(0);
        SharedCounter counter1 = new SharedCounter("SharedCounter1", 5, sharedCount);
        SharedCounter counter2 = new SharedCounter("SharedCounter2", 5, sharedCount);

        counter1.start();
        counter2.start();

        Thread.State state1 = counter1.getState();
        Thread.State state2 = counter2.getState();
        System.out.println("T1 : " + state1 + ", T2 : " + state2);

        while (counter1.isAlive() || counter2.isAlive()) {
            if ((counter1.getState() != state1) ||
                    (counter2.getState() != state2)) {
                state1 = counter1.getState();
                state2 = counter2.getState();
                System.out.println("T1 : " + state1 + ", T2 : " + state2);
            }
            Thread.sleep(10);
        }
    }
}

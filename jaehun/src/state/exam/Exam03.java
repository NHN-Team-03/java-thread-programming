package state.exam;

public class Exam03 {
    public static void main(String[] args) throws InterruptedException {
        SharedCount sc = new SharedCount();
        SharedCounter counter1 = new SharedCounter("T1", 5, sc);
        SharedCounter counter2 = new SharedCounter("T2", 5, sc);

        counter1.start();
        counter2.start();

        Thread.State state1 = counter1.getThread().getState();
        Thread.State state2 = counter2.getThread().getState();

        System.out.println("T1 : " + state1 + ", T2 : " + state2);

        while (counter1.getThread().isAlive() && counter2.getThread().isAlive()) {
            if ((counter1.getThread().getState() != state1) || (counter2.getThread().getState() != state2)) {
                state1 = counter1.getThread().getState();
                state2 = counter2.getThread().getState();

                System.out.println("T1 : " + state1 + ", T2 : " + state2);
            }

            Thread.sleep(10);
        }

    }
}

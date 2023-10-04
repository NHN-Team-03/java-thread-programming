package quiz02;

public class RunnableCounter extends Thread {

    int maxCount;
    int count = 0;

    public RunnableCounter(String name, int maxCount) {
        setName(name);
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        while (count < maxCount) {
            try {
                count++;
                System.out.println(this.getName() + " : " + count);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(this.getName() + " stopped.");
    }


}

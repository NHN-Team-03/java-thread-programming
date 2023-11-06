package yongjun.thread_class_extensioin;

public class ThreadCounter extends Thread{
    int count;
    int maxCount;

    public ThreadCounter(String name, int maxCount) {
        this.count = 0;
        setName(name);
        this.maxCount = maxCount;
    }

    public static void main(String[] args) {
        ThreadCounter counter = new ThreadCounter("counter", 50);
        counter.start();
    }

    public void run() {
        for (count = 0; count < this.maxCount; count++) {
            System.out.println(getName()+ " : " + count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

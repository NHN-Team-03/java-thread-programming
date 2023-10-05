package thread_class_extension.quiz;

public class ThreadCounter extends Thread{
    private String name;
    private int count;
    private int maxCount;

    public ThreadCounter(String name, int maxCount) {
        this.name = name;
        this.maxCount = maxCount;
        this.count = 0;
    }

    @Override
    public void run() {
        while(count < maxCount) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            System.out.println(name + " : " + count);
        }
    }
}

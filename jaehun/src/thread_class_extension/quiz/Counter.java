package thread_class_extension.quiz;

public class Counter{
    String name;
    int count;
    int maxCount;

    public Counter(String name, int maxCount) {
        this.name = name;
        this.maxCount = maxCount;
        this.count = 0;
    }

    public void run() throws InterruptedException {
        while(count < maxCount) {
            Thread.sleep(1000);
            count++;
            System.out.println(name + " : " + count);
        }
    }
}
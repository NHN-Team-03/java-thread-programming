package yongjun.synchronization.exam1_3;

public class SharedCounter extends Thread{
    SharedCountStatic sharedCountStatic;
    int count;
    int maxCount;

    public SharedCounter(String name, SharedCountStatic sharedCountStatic, int maxCount) {
        setName(name);
        this.sharedCountStatic = sharedCountStatic;
        this.count = 0;
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        while (count < maxCount) {
            count++;
            sharedCountStatic.increment();
        }
    }
}


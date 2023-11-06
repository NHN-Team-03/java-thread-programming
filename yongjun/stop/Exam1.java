package yongjun.stop;

public class Exam1 {
    public static void main(String[] args) {
        ThreadUnlimitedCounter counter = new ThreadUnlimitedCounter("Counter");
        counter.run();
    }
}

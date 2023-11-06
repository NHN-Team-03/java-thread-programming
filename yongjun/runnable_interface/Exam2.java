package yongjun.runnable_interface;

public class Exam2 {
    public static void main(String[] args) {
        SelfRunnableCounter counter = new SelfRunnableCounter("Counter", 10);
        counter.start();
    }

}

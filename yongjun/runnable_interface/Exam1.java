package yongjun.runnable_interface;

public class Exam1 {

    public static void main(String[] args) {
        RunnableCounter counter = new RunnableCounter("Counter", 5);
        Thread thread = new Thread(counter);;
        thread.start();
    }

}

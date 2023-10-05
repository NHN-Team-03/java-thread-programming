package damho.src.exam.chapter7.exam2;

import damho.src.exam.RunnableCounter;

public class Exam2 {
    public static void main(String[] args) {
        RunnableCounter counter = new RunnableCounter("test", 10);
        Thread thread = new Thread(counter, "test");
        thread.start();
        System.out.println(thread.getState());
    }
}

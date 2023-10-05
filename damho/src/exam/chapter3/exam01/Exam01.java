package damho.src.exam.chapter3.exam01;

import damho.src.exam.RunnableCounter;

public class Exam01 {
    public static void main(String[] args) {
        RunnableCounter counter = new RunnableCounter("counter", 5);
        Thread thread = new Thread(counter);
        
        thread.start();
    }
}

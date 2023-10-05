package runnable_interface_implement.exam;

import runnable_interface_implement.quiz.RunnableCounter;

public class Exam01 {
    public static void main(String[] args) {
        RunnableCounter counter = new RunnableCounter("counter", 5);
        
        Thread thread = new Thread(counter);
        thread.start();
    }
}

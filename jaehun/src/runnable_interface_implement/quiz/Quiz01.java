package runnable_interface_implement.quiz;

public class Quiz01 {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableCounter("runnableCounter", 10));

        thread.start();
    }
}

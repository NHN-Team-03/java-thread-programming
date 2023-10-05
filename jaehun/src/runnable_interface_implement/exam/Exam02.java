package runnable_interface_implement.exam;

public class Exam02 {
    public static void main(String[] args) {
        SelfRunnableCounter counter = new SelfRunnableCounter("counter", 5);

        counter.start();
    }
}

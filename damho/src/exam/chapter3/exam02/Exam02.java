package damho.src.exam.chapter3.exam02;

public class Exam02 {
    public static void main(String[] args) {
        SelfRunnableCounter counter = new SelfRunnableCounter("counter", 5);

        counter.start();
    }
}

package thread_class_extension.quiz;

public class Quiz01 {
    public static void main(String[] args) throws InterruptedException {
        Counter count = new Counter("counter", 10);

        count.run();
    }
}

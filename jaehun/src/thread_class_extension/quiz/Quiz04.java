package thread_class_extension.quiz;

public class Quiz04 {
    public static void main(String[] args) {
        ThreadCounter tc1 = new ThreadCounter("counter1", 10);
        ThreadCounter tc2 = new ThreadCounter("counter2", 10);

        tc1.start();
        tc2.start();
    }
}

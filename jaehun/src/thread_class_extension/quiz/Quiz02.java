package thread_class_extension.quiz;

public class Quiz02 {
    public static void main(String[] args) {
        ThreadCounter counter = new ThreadCounter("threadCounter", 10);

        counter.start();
    }
}

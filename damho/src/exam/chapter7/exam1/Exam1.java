package damho.src.exam.chapter7.exam1;

public class Exam1 {
    public static void main(String[] args) {
        Thread thread = new Thread("name");
        System.out.println(thread.getState());
    }
}

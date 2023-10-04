package exam02;

public class Exam02 {
    public static void main(String[] args) {
        Thread thread = new Thread();

        thread.start();
        System.out.println(thread.getState());
    }
}

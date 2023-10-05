package stop;

public class Quiz01 {
    public static void main(String[] args) throws InterruptedException {
        RunnableCounter counter = new RunnableCounter("counter", 5);

        Thread thread = new Thread(counter);

        thread.start();

        // running flag의 값을 false로 바꿔 실행중이던 thread의 run을 종료 했지만 이 후 다시 실행할 방법이 존재하지 않는다.
        counter.waiting();
        counter.restart();
    }
}

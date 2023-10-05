package thread_class_extension.quiz;

//counter1이 종료 된 이후 counter2가 실행된다.
// Thread class를 상속하지 않아서 run 메소드를 호출 하더라도 새로운 Thread가 생성되지 않아 단일 Thread에서 동작하기 때문이다.

public class Quiz03 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter("counter1", 10);
        Counter counter2 = new Counter("counter2", 10);

        counter1.run();
        counter2.run();
    }
}

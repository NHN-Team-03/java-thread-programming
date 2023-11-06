package yongjun.thread_class_extensioin;

import com.nhnacademy.thread_class_extension.Counter;

public class Quiz3 {
    public static void main(String[] args) {

//        Counter counter2 = new Counter("2", 10);
//        Counter counter1 = new Counter("1", 10);
        ThreadCounter counter2 = new ThreadCounter("2", 10);

        ThreadCounter counter1 = new ThreadCounter("1", 10);

        counter1.start();
        counter2.start();
    }
}

package thread_pool.exam;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam02 {
    public static void main(String[] args) {
        String[] urls = {"https://nhnacademy.dooray.com/page-files/3481345949028747701",
                "https://nhnacademy.dooray.com/page-files/3481345949029027955",
                "https://nhnacademy.dooray.com/page-files/3481345949033727759",
                "https://nhnacademy.dooray.com/page-files/3481345949034048654",
                "https://nhnacademy.dooray.com/page-files/3481345949034798740",
                "https://nhnacademy.dooray.com/page-files/3481345949034913349"
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(String url : urls) {
            Runnable worker = new DownloadWorker(url);
            executor.execute(worker);
        }
    }
}

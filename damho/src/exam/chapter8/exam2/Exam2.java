package damho.src.exam.chapter8.exam2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import damho.src.exam.chapter8.*;

public class Exam2 {
    public static void main(String[] args) {
        String[] urls = { "https://nhnacademy.dooray.com/share/drive-files/ocfkrcbb5vui.JMwL9-kHTKKJ6YhS-Xykpg",
                "https://nhnacademy.dooray.com/share/drive-files/ocfkrcbb5vui.CH51Oh3xTaSSmHwhVhYrgQ",
                "https://nhnacademy.dooray.com/share/drive-files/ocfkrcbb5vui.6xuIQS1YSESJmigo2ECzQw",
                "https://nhnacademy.dooray.com/share/drive-files/ocfkrcbb5vui.xzEwVuqrTVm23HKK_vCm0Q",
                "https://nhnacademy.dooray.com/share/drive-files/ocfkrcbb5vui.X_otcNhCRKWruinRW2gyFA",
                "https://nhnacademy.dooray.com/share/drive-files/ocfkrcbb5vui.WXsaSz-ARo2DryGsEK0S_w"

        };
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (String url : urls) {
            Runnable worker = new DownloadWorker(url);
            executor.execute(worker);
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("다운로드 끝.");
    }
}

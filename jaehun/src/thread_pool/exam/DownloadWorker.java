package thread_pool.exam;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class DownloadWorker implements Runnable{
    private String url;

    public DownloadWorker(String url) {
        this.url = url;
    }


    @Override
    public void run() {
        String filename = url.substring(url.lastIndexOf("/") + 1);

        try (InputStream inputStream = new URL(url).openStream();
            FileOutputStream outputStream = new FileOutputStream(filename)) {

            byte[] buffer = new byte[2048];
            int length;
            while((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }

            inputStream.close();
            outputStream.close();

            System.out.println(filename + " 다운로드 완료");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

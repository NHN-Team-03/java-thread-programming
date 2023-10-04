package quiz01;

public class Ticker extends Thread {

    long millis;
    int nanos;
    public Ticker(String input) {
        if (input.charAt(input.length() - 1 ) == 'n') {
            nanos = Integer.parseInt(input);
        }
        millis = Long.parseLong(input);
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            long startTime = System.currentTimeMillis();
            try {
                if (nanos != 0) {
                    Thread.sleep(millis, nanos);
                } else {
                    Thread.sleep(millis);
                }
                long endTime = System.currentTimeMillis();
                System.out.println(endTime - startTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

    }
}

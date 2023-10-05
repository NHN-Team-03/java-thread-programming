package damho.src.exam;


/**
 * Counter
 */
public class Counter {
    String name;
    int count;

    public Counter(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public void run() {
        int number = 0;
        while (!Thread.interrupted() && number < this.count) {
            System.out.println(this.name + " : " + ++number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                System.out.println("InterruptedException 발생");
                Thread.currentThread().interrupt();
            }
        }
    }
}

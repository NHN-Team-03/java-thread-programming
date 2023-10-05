package damho.src.exam.chapter6.exam5;

import java.time.LocalDateTime;

public class Main2 {
    public static void main(String[] args) {
        Pipe pipe = new Pipe();
        Thread sender1 = new Thread(new Sender(pipe));
        Thread sender2 = new Thread(new Sender(pipe));
        Thread receiver = new Thread(new Receiver(pipe, 9));
        Thread.State sender1PreviousState;
        Thread.State sender2PreviousState;
        Thread.State receiverPreviousState;

        sender1.start();
        sender2.start();
        receiver.start();

        sender1PreviousState = sender1.getState();
        sender2PreviousState = sender1.getState();
        receiverPreviousState = sender1.getState();

        while (!Thread.interrupted() && ((sender1.getState() != Thread.State.TERMINATED)
                && (receiver.getState() != Thread.State.TERMINATED))) {
            Thread.State sender1State = sender1.getState();
            Thread.State sender2State = sender2.getState();
            Thread.State receiverState = receiver.getState();
            try {
                if ((sender1PreviousState != sender1State) || (receiverPreviousState != receiverState)
                        || sender2PreviousState != sender2State) {
                    System.out.println("[ " + LocalDateTime.now() + " ]"
                            + " Sender : " + sender1State
                            + ", Sender2 : " + sender2State
                            + ", Receiver : " + receiverState);
                    
                    sender1PreviousState = sender1State;
                    sender2PreviousState = sender2State;
                    receiverPreviousState = receiverState;
                }
                Thread.sleep(10);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

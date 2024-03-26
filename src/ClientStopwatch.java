import java.time.LocalTime;


public class ClientStopwatch {
    public static void main (String []args) throws InterruptedException {
        Stopwatch trialOne = new Stopwatch();
        Stopwatch trialTwo = new Stopwatch();

        trialOne.start();
        Thread.sleep(2000);
        trialOne.stop();

        System.out.println("Time elapsed was " + trialOne.elapsedTime());

        trialTwo.start();
        Thread.sleep(6000);
        trialTwo.stop();

        System.out.println("Time elapsed was " + trialTwo.elapsedTime());

    }
}

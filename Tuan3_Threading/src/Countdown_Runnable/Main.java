package Countdown_Runnable;

public class Main {
    public static void main(String[] args) {
        Countdown_Runnable countdownRunnable = new Countdown_Runnable();
        Thread thread = new Thread(countdownRunnable);
        thread.start();
    }
}

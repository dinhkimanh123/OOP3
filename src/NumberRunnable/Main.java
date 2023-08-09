package NumberRunnable;

public class Main {
    public static void main(String[] args) {
        NumberRunnable numberRunnable = new NumberRunnable();
        Thread thread = new Thread(numberRunnable);
        thread.start();
    }
}

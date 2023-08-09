package Number_Runnable;

public class Main {
    public static void main(String[] args) {
        Number number = new Number();
        Thread thread = new Thread(number);
        thread.start();
    }
}

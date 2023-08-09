package NumberRunnable;

public class NumberRunnable implements Runnable {
    @Override
    public void run(){
        for (int i = 1; i <=20 ; i++) {
            System.out.println(i);
        }
    }

}

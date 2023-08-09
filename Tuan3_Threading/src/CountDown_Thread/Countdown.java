package CountDown_Thread;

public class Countdown extends Thread {
    @Override
    public void run(){
        for (int i = 10; i >= 1 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

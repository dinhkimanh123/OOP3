package Countdown_Runnable;

public class Countdown_Runnable implements Runnable {
    @Override
    public void run(){
        for (int i = 10; i >=1 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

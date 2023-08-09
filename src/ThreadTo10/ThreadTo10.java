package ThreadTo10;

public class ThreadTo10 implements Runnable {
    @Override
    public void run(){
        for (int i = 6; i <=10 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadTo10 threadTo10 = new ThreadTo10();
        Thread thread = new Thread(threadTo10);
        thread.start();
    }
}

package Number_Thread;

public class Number extends Thread {
    @Override
    public void run(){
        for (int i = 2; i <= 10 ; i += 2) {
            System.out.println(i);
        }
    }
}

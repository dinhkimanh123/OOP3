package NumberRandom_Thread;

import ChanLe.Main;

public class GuessANumberThread extends  Thread {
    int doanso = 0;
    int dem = 0;

    public GuessANumberThread (int doanso) {
        this.doanso = doanso;
    }
    @Override
    public void run(){
        int randomNumber = 0;
        do {
            randomNumber = (int) ( Math.random() * 100 + 1 ) ;
            dem++;
            System.out.println(getName() + " doan so " + randomNumber);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }while (randomNumber != doanso);
        System.out.println(getName() + "so doan ra la : " + doanso + "trong" + dem + "lan dem");
    }
}

package SoNguyenTo;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run(){
        for (int i = 1; i <= 100 ; i++) {
            if (Ktra_SNT(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean Ktra_SNT(int n){
        // ktra SNT
        if (n < 2) {
            return false ;
        }
        int can_bac2 = (int) Math.sqrt(n);
        for (int i = 2; i <= can_bac2 ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

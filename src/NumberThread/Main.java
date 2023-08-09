package NumberThread;

import NumberThread.EvenNumberThread;

public class Main {
    public static void main(String[] args) {
        EvenNumberThread evenNumberThread = new EvenNumberThread();
        evenNumberThread.start();
    }
}

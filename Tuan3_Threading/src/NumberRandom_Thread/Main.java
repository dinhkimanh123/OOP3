package NumberRandom_Thread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập một số nguyên để các thread đoán: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        GuessANumberThread thread1 = new GuessANumberThread(number);
        GuessANumberThread thread2 = new GuessANumberThread(number);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();

    }
}
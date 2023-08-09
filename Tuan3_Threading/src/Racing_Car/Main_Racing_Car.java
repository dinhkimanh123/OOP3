package Racing_Car;

public class Main_Racing_Car {
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        Racing_Cars car1 = new Racing_Cars("A");
        Racing_Cars car2 = new Racing_Cars("B");
        Racing_Cars car3 = new Racing_Cars("C");

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        System.out.printf("Thoi gian : 100KM");
        thread1.start();
        thread2.start();
        thread3.start();


    }

}

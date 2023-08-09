package Racing_Car;

import Racing_Car.Main_Racing_Car;

import java.util.Random;

public class Racing_Cars implements Runnable {
    private String Roll_royce;
    public Racing_Cars(String Roll_royce){
        this.Roll_royce = Roll_royce;
    }

@Override
public void run() {
    // Khởi tạo điểm start (hay km ban đầu)
    int runDistance = 0;
    // Khởi tạo time bắt đầu cuộc đua
    long startTime = System.currentTimeMillis();
    // Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
    while (runDistance < Main_Racing_Car.DISTANCE) {
        try {
            // Random tốc độ KM/H
            int speed = (new Random()).nextInt(20);
            // Tính toán khoảng cách đã đi được
            runDistance += speed;
            // Vẽ đường đã đi của xe
            String log = "|";
            int percentTravel = (runDistance * 100) / Main_Racing_Car.DISTANCE;
            for (int i = 0; i < Main_Racing_Car.DISTANCE; i += Main_Racing_Car.STEP) {
                if (percentTravel >= i + Main_Racing_Car.STEP) {
                    log += "=";
                } else if (percentTravel >= i && percentTravel < i + Main_Racing_Car.STEP) {
                    log += "o";
                } else {
                    log += "-";
                }
            }
            log += "|";
            System.out.println("Car" + this.Roll_royce + ": " + log + "" + Math.min(Main_Racing_Car.DISTANCE, runDistance) + "KM");
            Thread.sleep(5);
        } catch (InterruptedException e) {
            System.out.printf("car " + this.Roll_royce);
            break;
        }
    }
    long endtime = System.currentTimeMillis();
    System.out.printf("car " + this.Roll_royce + " finish in " + (endtime - startTime) / 100 + "s");
    }
}
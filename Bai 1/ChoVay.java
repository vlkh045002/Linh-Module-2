import java.util.Scanner;
public class ChoVay {
    public static void main(String[] args) {
        double tienGui = 0;
        double tyLeLaiSuat = 1.0;
        int soThangDaGui = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        tienGui = input.nextDouble();
        System.out.println("Nhập tỷ lệ lãi suất");
        tyLeLaiSuat = input.nextDouble();
        System.out.println("Nhập số tháng đã gửi: ");
        soThangDaGui = input.nextInt();

        double tongLaiSuat = 0;
        for (int i = 0; i < soThangDaGui; i++){
            tongLaiSuat = tienGui * (tyLeLaiSuat / 100 / 12) * soThangDaGui;
        }

        System.out.printf("Tổng lãi suất là: " + tongLaiSuat);

    }
}
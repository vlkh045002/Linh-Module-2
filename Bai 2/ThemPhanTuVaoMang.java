import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {6, 8, 3, 9, 7, 4, 5};

        Scanner input = new Scanner(System.in);
        System.out.print("\n Nhập số cần chèn vào mảng: n = ");
        int n = input.nextInt();
        System.out.print("Nhập vị trí cần chèn vào mảng: k = ");
        int k = input.nextInt();

        System.out.printf("Chèn %d vào mảng ở vị trí thứ %d", n, k);


    }
}

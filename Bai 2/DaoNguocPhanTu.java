import java.util.Scanner;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.println("Nhập kích thước tối đa của mảng: ");
            size = input.nextInt();

            if (size > 20) {
                System.out.println("kích thước mảng khôgng quá 20");
            }
        } while (size > 20);

        //Nhập các phần tử vào mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + (i + 1) + " : ");
            array[i] = input.nextInt();
            i++;
        }

        //In ra danh sách mảng vừa nhập vào
        System.out.println("Mảng vừa được nhập vào: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        //Đảo ngược mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        //Im mảng sau khi đảo ngược
        System.out.println("\n");
        System.out.println("Mảng sau ki đảo ngược là: ");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t ");
        }
    }
}
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[100];
        System.out.println("Danh sách mảng ngẫu nhiên gồm: ");
        array = creatRandom();

        System.out.println("\nVui lòng nhập chỉ số của 1 phần tử bất kỳ: ");
        int x = sc.nextInt();

        try {
            System.out.println("Giá trị của phàn tử có chỉ số " + x + " là: " + array[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }

    }

    public static int[] creatRandom() {
        Random rd = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
        return arr;
    }
}
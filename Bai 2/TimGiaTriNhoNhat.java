import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array;
        int size;
        do {
            System.out.println("Nhập kich thước tối đa của array");
            size = input.nextInt();

            if (size > 20) {
                System.out.println("Kích thước tối đa không quá 20");
            }
        } while (size > 20);

        //Nhập vào mảng
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        //Hiển thị mảng vừa nhập
        System.out.println("Mảng vừa nhập là: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
        }
        //Tìm giá trị nhỏ nhất
        int index = findMinValue(array);
        System.out.println("\n" + "Giá trị nhỏ nhất trong mảng là: " + array[index]);

    }

    public static int findMinValue(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                index = j;
            }
        }
        return index;
    }
}
import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {

        int[] array;
        int size;
        Scanner scan = new Scanner(System.in);
        //Khai báo các biến, nhập và kiểm tra kích thước mảng
        do {
            System.out.println("Nhập kích thước tối đa của mảng: ");
            size = scan.nextInt();

            if (size > 20) {
                System.out.println("Kích thước mảng không quá 20");
            }
        } while (size > 20);

        // Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scan.nextInt();
            i++;
        }

        //In ra danh sách mảng đã nhập
        System.out.println("Danh sách mảng:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        //Tìm giá trị lớn nhất trong mảng
        int max = array[0];
        int index = 0;
        for (int j = 1; j < array.length; j++){
            if (array[j] > max){
                max = array[i];
                index = j;
            }
        }

        System.out.println("Giá trị lớn nhất trong mảng là: " + max + " tại vị trí " + (index + 1));

    }
}
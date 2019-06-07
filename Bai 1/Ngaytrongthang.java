import java.util.Scanner;
public class Ngaytrongthang {
    public static void main(String[] args) {
        System.out.println("Nhập tháng để kiểm tra số ngày");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();

        String daysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 2:
                daysInMonth = "28 hoặc 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }
        if (daysInMonth != ""){
            System.out.println("Tháng " + month + " có " + daysInMonth + " ngày.");
        }else System.out.print("Invalid input!");

    }

}
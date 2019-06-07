import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        double celsius;
        double fahrenheit;
        do {
            System.out.println("MENU");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("Mời bạn chọn chức năng: ");
            choice = scan.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Nhập fahrenheit");
                    fahrenheit = scan.nextDouble();
                    System.out.println(fahrenheit + " fahrenheit = " +fahrenheitToCelsius(fahrenheit) + " celsius");
                    break;
                case 2:
                    System.out.println("Nhập celsius: ");
                    celsius = scan.nextDouble();
                    System.out.println(celsius + " celsius = " + celsiusToFahrenheit(celsius) +" fahrenheit");
                    break;
                case 3:
                    System.exit(0);
            }

        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
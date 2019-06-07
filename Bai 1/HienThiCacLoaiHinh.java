import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("MENU");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    PrintTheRectangle();
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    PrintTheSquareTriangle();
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    PrintIsoscelesTriangle();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }

    }

    public static void PrintTheRectangle() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public static void PrintTheSquareTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public static void PrintIsoscelesTriangle() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2 * 10; j++)
                if (j >= (10 - 1 - i) && j <= (10 - 1 + i))
                    System.out.print("*");
                else System.out.print("");
            System.out.print("\n");

        }
    }

}
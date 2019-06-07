import java.util.Scanner;
public class Isprime {
    public static void main(String[] args) {
        boolean check = true;
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();

        if (number < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }

        if (check)
            System.out.println(number + " is a prime.");
        else
            System.out.println(number + " is not a prime.");

    }
}
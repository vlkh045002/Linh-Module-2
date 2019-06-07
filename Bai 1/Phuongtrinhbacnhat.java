import java.util.Scanner;
public class Phuongtrinhbacnhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scan = new Scanner(System.in);
        double a, b;
        System.out.println("Enter a: ");
        a = scan.nextDouble();
        System.out.println("Enter b: ");
        b = scan.nextFloat();

        if (a != 0){
            double nghiem = -b/a;
            System.out.println("Phương trình có 1 nghiệm là: " + nghiem);
        }else{
            if (b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }



    }
}
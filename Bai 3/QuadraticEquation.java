import java.util.Scanner;
public class  QuadraticEquation {
    double a,b,c;
    public  QuadraticEquation(){
    }
    public  QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        return  ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
    public double getRoot2(){
        return  ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a= scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new  QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.print("Equations have 2 root: "+ quadraticEquation.getRoot1()+" and "+ quadraticEquation.getRoot2());
        }
        else if(quadraticEquation.getDiscriminant()==0){
            System.out.print("Equations has 1 root : "+ quadraticEquation.getRoot1());
        }
        else {
            System.out.print("The equation has no roots");
        }


    }
}

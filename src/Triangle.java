import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the side of triangle");
        System.out.print("Input the first side: ");
        double side1 = scanner.nextDouble();

        System.out.print("Input the second side: ");
        double side2 = scanner.nextDouble();

        System.out.print("Input the third side: ");
        double side3 = scanner.nextDouble();

        System.out.println("The area of the triangle is: "+area(side1, side2, side3));

    }

    public static boolean isValid(double side1, double side2, double side3){
        if(side1 + side2 > side3){
            return true;
        }else if(side1 + side3 > side2){
            return true;
        }else if(side2 + side3 > side1){
            return true;
        }else{
            return false;
        }
    }

    public static double area(double side1, double side2, double side3){
        if(isValid(side1, side2, side3)) {
            double s = (side1 + side2 + side3) / 2;

            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }else {
            return 0;
        }
    }
}
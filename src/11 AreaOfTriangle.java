import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Base of triangle in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of triangle in cm: ");
        double height = input.nextDouble();

        double Area = 0.5 * base * height;  // or (base * height) / 2

        System.out.println("Area of triangle is : " + Area + " cm2");
    }
}

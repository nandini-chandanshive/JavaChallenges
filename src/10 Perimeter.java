import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {

        //perimeter of rectangle abcd

        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of rectangle in cm: ");
        double L = input.nextDouble();
        System.out.print("Enter breadth of rectangle in cm: ");
        double B = input.nextDouble();

        double Perimeter = 2 * (L + B);

        System.out.println("Perimeter of Rectangle is: " + Perimeter + " cm");





    }
}

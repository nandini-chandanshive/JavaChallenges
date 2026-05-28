import java.util.Scanner;

class floatMultiplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double Product = num1 * num2;
        System.out.println("Product: " + Product);
        //System.out.println("product: " + (num1 + num2));   u can also write in this way directly but here bracket is
        //must...if no bracket used than could give wrong answer

    }
}

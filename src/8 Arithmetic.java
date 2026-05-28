import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {

        System.out.println("Welcome to Arithmetic calculator!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int add,sub,multiply,divide,modulus;
        add = a + b;
        sub = a - b;
        multiply = a * b;
        divide = a / b;
        modulus = a % b;
        System.out.println("Addition: " + add);
        System.out.println("Substraction: " + sub);
        System.out.println("multiplication: " + multiply);
        System.out.println("Division: " + divide);
        System.out.println("Modulus: " + modulus);

        System.out.println("Calculations done!");
    }
}

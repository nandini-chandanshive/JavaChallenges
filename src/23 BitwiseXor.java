import java.util.Scanner;

class BitwiseXor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();

        int c = a ^ b;
        System.out.println("Result is: " + c);
    }
}

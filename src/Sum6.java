import java.util.Scanner;

public class Sum6 {
    public static void main(String[] args){

        System.out.println("----Welcome to our calculator!----");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int addition = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + addition );
    }
}

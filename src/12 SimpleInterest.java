import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value  of principle amount in Rs: ");
        int P = input.nextInt();
        System.out.print("Enter value of rate of interest: ");
        float R = input.nextFloat();
        System.out.print("Enter value of time in years: ");
        float T = input.nextFloat();

        float SimpleInterest = (P * R * T) / 100;

        System.out.println("Simple interest is Rs : " + SimpleInterest);
    }
}

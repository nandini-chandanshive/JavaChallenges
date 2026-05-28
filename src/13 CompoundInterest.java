import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value  of principle amount in Rs: ");
        int P = input.nextInt();
        System.out.print("Enter value of rate of interest: ");
        float R = input.nextFloat();
        System.out.print("Enter value of time in years: ");
        float T = input.nextFloat();

        double compoundInterest = P * Math.pow(( 1 + R / 100), T);

        System.out.println("Compound interest is Rs : " + compoundInterest);
    }
}

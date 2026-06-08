import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of integers calculator!");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        long result = sum(num);
        System.out.println("Sum is: " + result);

    }

    public static long sum(int num) {
        long sum = 0;
        int i = 1;
        while (i <= num) {
            sum = sum + i;
            i++;
        }
        return sum;
    }
}

    /*  ---alternative method---by sir
    public static int sum(int sum){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
     */


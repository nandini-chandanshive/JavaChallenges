import java.util.Scanner;

class SumOdd {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd number sum calculator!");
        System.out.print("Enter a number till which u want sum: ");
        int num = input.nextInt();
        int result = sum(num);
        System.out.println("sum is: " + result);
    }

    public static int sum(int num){

        int sum = 0;
        int i = 1;
        while(i <= num){
            sum = sum + i;
            i = i + 2;
        }
        return sum;
    }
}

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial calculator!");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        long ans = fact(num);
        System.out.println("factorial is: " + ans);

    }

    public static long fact(int num){

        if(num < 2){
            return 1;
        }
        long result = 1;
        int i = 2;
        while(i <= num){
            result = result * i;
            i++;
        }
        return result;
    }
}

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number till which series nedd to be printed: ");
        int num = input.nextInt();
        fibonacci(num);

    }

    public static void fibonacci(int num){

        if (num < 0){
            return;
        }
        System.out.print("0 ");
        if (num == 0){
            return;
        }

        int first = 0;
        int second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}

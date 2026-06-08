import java.util.Scanner;

class ReverseDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int num = input.nextInt();
        int result = reverse(num);
        System.out.println("Reversed digit is: " + result);

    }

    public static int reverse(int num){

        int newNum = 0;
        while(num > 0){
            int digit = num % 10;   //stores last digit of number in variable digit
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}

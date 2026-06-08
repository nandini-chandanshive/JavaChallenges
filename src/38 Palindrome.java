import java.util.Scanner;

class Palindrome {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(isPalindrome(num)){
            System.out.println(num + " is a palindrome");
        }
        else{
            System.out.println(num + " is not a palindrome");
        }

    }

    public static boolean isPalindrome(int num){
        return num == reverse(num);
    }

    public static int reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }

}

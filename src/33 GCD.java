import java.util.Scanner;

class GCD {
    public static void main(String[] args) {

        /*
            gcd of two numbers is the number which divides both of those numbers
         */
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to gcd calculator!");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int result = gcd(num1,num2);
        System.out.println("GCD is: " + result);


    }

    public static int gcd(int num1, int num2){

        int least = least(num1,num2);
        int i = least;
        while(i <= least){
            if((num1 % i == 0) && (num2 % i == 0)){
                return i;
            }
            i--;
        }
        return 0;
    }

    public static int least(int num1, int num2){
        if(num1 < num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}


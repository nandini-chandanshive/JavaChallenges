import java.util.Scanner;

class Prime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean result = prime(num);
        if(result) {
            System.out.println(num + " is prime");
        }
        else{
            System.out.println(num + " is not prime");
        }

    }

    public static boolean prime(int num){

        int i = 2;
        while(i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}

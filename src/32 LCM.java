import java.util.Scanner;

class LCM {
    public static void main(String[] args) {

        // lcm of two numbers is the smallest number divisible by both numbers
        //        example: 4 ---> 4,8,12,16...
        //                 6 ---> 6,12,18.....
        //         here, the lcm of these two numbers is 12

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to lcm calculator!");
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int result = lcm(num1, num2);
        System.out.println("lcm is: " + result);

    }

    public static int lcm(int num1, int num2) {
        int i = 1;
        while (i <= num2) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
        return 0;    //unreachable
    }
}
    /*      instead can also write like this

    public static int lcm(int num1, int num2) {
        int i = 1;
        while (true) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
    }

     */


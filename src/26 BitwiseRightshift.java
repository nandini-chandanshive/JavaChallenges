import java.util.Scanner;

class BitwiseRightshift {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = input.nextInt();

        int c = a >> 2;
        System.out.println("Result is: " + c);

        //in output the input will be divided by 2 raise to the number of shifts done
        //eg.if input=4 and shift is 2 than ans will be 4 / 2^2


    }
}

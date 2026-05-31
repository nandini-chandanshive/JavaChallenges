import java.util.Scanner;

class BitwiseCompliment { //bitwiseNot
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = input.nextInt();

        int c = ~ a;
        System.out.println("Result is: " + c);


    }
}

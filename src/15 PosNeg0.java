import java.util.Scanner;

class PosNeg0 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if(num == 0){
            System.out.println("number is zero");
        }
        else if(num < 0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is positive");
        }
    }
}

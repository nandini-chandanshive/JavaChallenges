import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num == 0){
            System.out.println("Number is zero");
        }
        else if(num % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("number is odd");
        }

    }
}

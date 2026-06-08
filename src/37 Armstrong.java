import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(isArmstrong(num)){
            System.out.println(num + " is armstrong");
        }
        else{
            System.out.println(num + " is not armstrong");
        }

    }

    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while(num > 0){
            int lastdigit = num % 10;
            num /= 10;
            finalNumber += pow(lastdigit, noOfDigits);
        }
        return finalNumber == numCopy;
    }

    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i < num2){
            result = result * num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num = num / 10;
        }
        return digits;
    }
}

import java.util.Scanner;

class MultiplicationTable {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter a number for which table u want: ");
        int num = input.nextInt();

        int i = 1;
        while(i <= 10){
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }

    }
}

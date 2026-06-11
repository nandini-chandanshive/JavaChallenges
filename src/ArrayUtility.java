import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int index = 0;
        while(index < size){
            System.out.print("Enter the element no." + (index + 1) + ": ");
            arr[index] = input.nextInt();
            index++;
        }
        return arr;
    }
}

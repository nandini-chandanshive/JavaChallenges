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

    public static void displayArray(int[] newArr) {
        int i = 0;
        while (i < newArr.length) {
            System.out.print(newArr[i] + " ");
            i++;
        }
    }

    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = input.nextInt();
        int[][] numArray = new int[rows][columns];

        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < columns) {
                System.out.print("Please enter element row:" + (i + 1) + ",column:" + (j + 1) + " :");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }
}

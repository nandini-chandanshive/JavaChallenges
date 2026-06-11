import java.util.Scanner;

class SumAverageArray {
    public static void main(String[] args) {

        //this inputs the elements and stores in array
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

        double sum = sum(size,arr);
        System.out.println("Sum is: " + sum);
        double avg = average(size,arr);
        System.out.println("Average is: " + avg);

    }

    public static double sum(int size, int[] arr){
         double sum = 0;
         int i = 0;
         while(i < size){
             sum = sum + arr[i];
             i++;
         }
        return sum;
    }

    public static double average(int size,int[] arr){
        double avg = sum(size,arr)/size;
        return avg;
    }
}

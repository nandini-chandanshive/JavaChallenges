import java.util.Scanner;

class noOfOccurence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter the number for which u want to check occurence: ");
        int num = input.nextInt();
        int result = occurence(arr,num);
        System.out.println("the number of occurence of " + num + " in an array is: " + result);

    }

    public static int occurence(int[] arr, int num){
        int total = 0;
        int index = 0;
        while(index < arr.length){
            if(arr[index] == num){
                total++;
            }
            index++;
        }
        return total;
    }
}

import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the number to be deleted from array: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array");
        displayArray(newArr);

    }

    public static int[] deleteNumber(int[] numArr, int numToDelete){
        int occ = noOfOccurence.occurence(numArr, numToDelete);
        if(occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while(i < numArr.length){
            if(numArr[i] != numToDelete){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }

    public static void displayArray( int[] newArr){
        int i = 0;
        while(i < newArr.length){
            System.out.print(newArr[i] + " ");
            i++;
        }
    }
}

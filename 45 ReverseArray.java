class ReverseArray {
    public static void main(String[] args) {

        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Your reversed array is: ");
        ArrayUtility.displayArray(numArr);
    }

    public static void reverse(int[] numArr){
        int i = 0;
        while(i < numArr.length/2){
            int swap = numArr[i];
            numArr[i] = numArr[(numArr.length -1) - i];
            numArr[(numArr.length -1 - i)] = swap;
            i++;
        }
    }
}

class isSortedArray {
    public static void main(String[] args) {

        int[] numArr = ArrayUtility.inputArray();
        boolean inc = isIncreasing(numArr);
        boolean dec = isDecreasing(numArr);
        if(inc || dec){
            System.out.println("Given array is sorted");
        }
        else{
            System.out.println("Given array is not sorted");
        }
    }

    public static boolean isIncreasing(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if(numArr[i] < numArr[i - 1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if(numArr[i] > numArr[i - 1]){
                return false;
            }
            i++;
        }
        return true;
    }

}

class MaxMinArray {
    public static void main(String[] args) {

        int[] numArr = ArrayUtility.inputArray();
        int max = max(numArr);
        System.out.println("Maximum number is: " + max);
        int min = min(numArr);
        System.out.println("Minimum number is: " + min);

    }

    public static int max(int[] numArr){
        if(numArr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i = 1;
        while(i < numArr.length){
            if(max < numArr[i]){
                max = numArr[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] numArr){
        if(numArr.length == 0){
            return Integer.MAX_VALUE;
        }
        int min = numArr[0];
        int i = 1;
        while(i < numArr.length){
            if(min > numArr[i]){
                min = numArr[i];
            }
            i++;
        }
        return min;
    }
}

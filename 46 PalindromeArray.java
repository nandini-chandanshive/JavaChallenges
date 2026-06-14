class PalindromeArray {
    public static void main(String[] args) {

        int[] numArr = ArrayUtility.inputArray();
        if(isPalindrome(numArr)){
            System.out.println("Given Array is a Palindrome");
        }
        else{
            System.out.println("Given Array is not a Palindrome");
        }

    }

    public static boolean isPalindrome(int[] numArr){
        int i = 0;
        while(i < numArr.length/2){
            if(numArr[i] != numArr[(numArr.length - 1)-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}

import java.util.Scanner;

class loopPatterns {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int maxRows = input.nextInt();
        rightHalfPyramid(maxRows);
        System.out.println();
        reverseRightHalfPyramid(maxRows);
        System.out.println();
        leftHalfPyramid(maxRows);

    }

    public static void rightHalfPyramid(int maxRows) {

        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void reverseRightHalfPyramid(int maxRows) {
        int rows = maxRows;
        while (rows > 0) {
            System.out.print("*");
            int i = rows;
            while (i > 1) {
                System.out.print(" *");
                i--;
            }
            System.out.println();
            rows--;

        }
    }

    public static void leftHalfPyramid(int maxRows){
        int rows = maxRows;
        while (rows > 0) {
            //this loop prints spaces
            int j = 0;
            while (j < rows) {
                System.out.print("  ");
                j++;
            }
            //this loop prints stars
            int i = 0;
            while (i <= (maxRows - rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
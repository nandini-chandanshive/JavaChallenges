import java.util.Scanner;

class DegreeConvert {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        float F = input.nextFloat();

        float C = (F - 32) * 5.0f /9.0f;

        System.out.println("Temperature in Celcius is: " + C);

    }
}

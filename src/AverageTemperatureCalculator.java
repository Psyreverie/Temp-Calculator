import java.util.Scanner;
public class AverageTemperatureCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many days of temperatures? ");
        int numberOfDays = scanner.nextInt();

        int[] temperatures = new int[numberOfDays];
        int sum = 0;

        for (int i = 0; i < numberOfDays; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextInt();
            sum += temperatures[i]; // Add to total sum
        }
}
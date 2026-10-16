import java.util.Scanner;

public class Q11_AverageTenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        double average = sum / 10;
        int aboveAverage = 0;

        for (double number : numbers) {
            if (number > average) {
                aboveAverage++;
            }
        }

        System.out.println("Average = " + average);
        System.out.println("Numbers above average = " + aboveAverage);
        sc.close();
    }
}

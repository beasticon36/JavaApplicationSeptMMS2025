import java.util.Scanner;

public class NumberCalculations{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Please enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        System.out.println("\n--- Results ---");

        double group1Sum = numbers[0] + numbers[4] + numbers[9];
        double group2Sum = numbers[2] + numbers[7] + numbers[1];
        double step1Result = group1Sum * group2Sum;
        System.out.println("Result of Step 1 [(Num1 + Num4 + Num5) * (Num3 + Num8 + Num2)]: " + step1Result);

        double group3Sum = numbers[3] + numbers[6] + numbers[5] + numbers[8];
        double finalResult = group3Sum - step1Result;
        System.out.println("Result of Step 2 [(Step 1 result) - (Num4 + num7 + num6 + num9)]: " + finalResult);

        System.out.println("Is the final result >= 100? " + (finalResult >= 100));
        
        if (finalResult >= 100) {
            System.out.println("Hurray!!! I did it");
        } else {
            System.out.println("I still need to learn more Java");
        }

        scanner.close();
    }
}
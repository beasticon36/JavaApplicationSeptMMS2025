import java.util.Scanner;

public class NumberLogicGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first set of 3 numbers:");
        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Number 3: ");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("Sum of the first 3 numbers: " + sum);

        if (sum % 2 == 0 || sum % 10 == 0) {
         
            System.out.println("\nCondition met! Enter a second set of 3 numbers:");
            System.out.print("Number 4: ");
            int num4 = scanner.nextInt();
            System.out.print("Number 5: ");
            int num5 = scanner.nextInt();
            System.out.print("Number 6: ");
            int num6 = scanner.nextInt();

            long product = (long) num4 * num5 * num6; 
            System.out.println("Product of the second set: " + product);

            if (product > 200) {
                System.out.println("Hurrah!!!");
            } else {
                System.out.println("Ongoing....");
            }

        } else {
            System.out.println("I will do this activity by myself");
        }

        scanner.close();
    }
}
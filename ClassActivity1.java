import java.util.Scanner;

public class ClassActivity{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("========================================================");
		
		System.out.println("TASK 1");
		
		System.out.print("Enter your first number: ");
		short num1 = input.nextShort();
		
		System.out.print("Enter your second number: ");
		short num2 = input.nextShort();
		
		System.out.print("Enter your third number: ");
		short num3 = input.nextShort();
		
		System.out.print("Enter your fourth number: ");
		short num4 = input.nextShort();
		
		System.out.print("Enter your fifth number: ");
		short num5 = input.nextShort();
		
		System.out.println("");
		
		int addition = num1 + num2 + num3 + num4 + num5;
		int average = addition / 5;
		int product = num1 * num2 * num3 * num4 * num5;
		
		System.out.printf("Sum of %d, %d, %d, %d, and %d = %d%n",num1,num2,num3,num4,num5,addition);
		System.out.printf("The average of %d, %d, %d, %d, and %d = %d%n",num1,num2,num3,num4,num5,average);
		System.out.printf("Product of %d, %d, %d, %d, and %d = %d%n",num1,num2,num3,num4,num5,product);
		
		System.out.println("");
		System.out.println("========================================================");
		
		System.out.println("TASK 2");
		
		System.out.print("Enter a number: ");
		int nu1 = input.nextInt();
		
		boolean isEven = (nu1)%2 == 0;
		System.out.printf("%d is an Even number? %b",nu1,isEven);
		
		System.out.println("");
		System.out.println("========================================================");
		
		System.out.println("TASK 3");
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your address: ");
		String addy = input.nextLine();
		
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		
		System.out.println("");
		System.out.printf("Info on %s%n",name);
		System.out.println("========================================================");
		
		System.out.printf("%s is %d years old%n",name,age);
		System.out.printf("This individual stays at %s%n",addy);
	}
}
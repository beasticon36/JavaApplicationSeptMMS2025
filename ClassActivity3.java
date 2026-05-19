import java.util.Scanner;

public class ClassActivity3{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
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
		
		System.out.printf("Hi, %s%n",name);
		System.out.printf("You are %d years old %n",age);
		System.out.printf("You stay at %s%n",addy);
	}
}
	

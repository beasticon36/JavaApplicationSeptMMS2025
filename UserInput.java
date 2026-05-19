import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.printf("Enter your gender: ");
		String gender = input.next();
		
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		
		System.out.print("Enter the number of students in your school: ");
		short numberOfStudents = input.nextShort();
		
		System.out.print("Enter your grade: ");
		char grade = input.next().charAt(0);
		
		System.out.print("Do you love love learning java(true/false): ");
		boolean loveJava = input.nextBoolean();
		
		System.out.println("");
		System.out.printf("Information about %s%n",name);
		System.out.println("==================================================================================");
		
		System.out.printf("Hello %s, your are welcome to NIIT %n",name);
		System.out.printf("You are a %s and you are %d years old%n",gender,age);
		System.out.printf("Ther are %d amount of students in your class%n",numberOfStudents);
		System.out.printf("Your grade is %c%n",grade);
		System.out.printf("Do you love Java? %b%n",loveJava);
	}
}

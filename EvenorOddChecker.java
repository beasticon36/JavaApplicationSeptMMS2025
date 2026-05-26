import java.util.Scanner;

public class EvenorOddChecker{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		char option;
		
		do{
			System.out.print("Enter number: ");
			int num = scan.nextInt();
			
			if (num % 2 == 0){
				System.out.printf("%d is an even number %n",num);
			}
			else{
				System.out.printf("%d is an odd number %n",num);
			}
			
			System.out.print("Do you wnat to run the program again?(Y/N): ");
			option = scan.next().charAt(0);
		}while(option == 'Y' || option == 'y');
		System.out.println("FVCK OFF B*TCH!!!");
	}
}
import java.util.Scanner;



public class MethodOverloading{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		
		System.out.println("================Calculating The Perimeter of Shapes================");
		System.out.println("Enter 1. for Square");
		System.out.println("Enter 2. for Rectangle");
		System.out.println("Enter 3. for Triangle");
		System.out.println("Enter 4. to End Program");
		
		System.out.print("Enter your choice: ");
		int choice = scan.nextInt();
		
		switch(choice){
			case 1:
			        System.out.print("Enter the length of the square: ");
					int lenOfSquare = scan.nextInt();
					
					Perimeter(lenOfSquare);
			break;
			
			case 2:
			        System.out.print("Enter the length of the Rectangle: ");
					int lenOfRect = scan.nextInt();
					
					
					System.out.print("Enter the width of the square: ");
					int widthOfRect = scan.nextInt();
					
					Perimeter(lenOfRect,widthOfRect);
					
			break;
			
			case 3:
			        System.out.print("Enter sideA: ");
					int sideA = scan.nextInt();
					
					System.out.print("Enter sideB: ");
					int sideB = scan.nextInt();
					
					System.out.print("Enter sideC: ");
					int sideC = scan.nextInt();
					
					Perimeter(sideA,sideB,sideC);
			break;
			default:
			        System.out.println("Program Excecuted, Good Bye!!!");
		}
	}
	
	public static void Perimeter(int lenOfSquare){
		int perimeterOfSquare = 4 * lenOfSquare;
		
		System.out.printf("The perimeter of the square is %d%n",perimeterOfSquare);
	}
	public static void Perimeter(int lenOfRect, int widthOfRect){
		int perimeterOfRectangle = 2 * (lenOfRect + widthOfRect);
		
		System.out.printf("The perimeter of the rectangle is %d%n",perimeterOfRectangle);
	}
	public static void Perimeter(int sideA, int sideB, int sideC){
		int perimeterOfTriangle = sideA + sideB + sideC;
		
		System.out.printf("The perimeter of the triangle is %d%n",perimeterOfTriangle);
	}
}
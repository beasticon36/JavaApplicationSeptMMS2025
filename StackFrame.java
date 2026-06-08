public class StackFrame{
	public static void main(String[] args){
		
	}
	public void readMe(String story){
		System.out.println("==========STORY=========");
		System.out.printf("%s%n",story);
	}
	
	public static void checkAge(int age){
		if(age >= 18){
			System.out.printf("You are %d years old, you are an adult",age);
		}
		else{
			System.out.printf("You are %d years old, you are still a minor",age);
		}
	}
}
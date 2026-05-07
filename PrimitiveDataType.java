public class PrimitiveDataType{
	public static void main(String[] args){
		byte myAge = 30;
		System.out.printf("Miss Mercy is %d years old\n",myAge);
		
		short quantity = 20000;
		System.out.printf("Quantity of iPhone Ordered is %,d%n",quantity);
		
		int nigeriapopulation = 294800999;
		System.out.printf("The population of Nigeria is %,d%n",nigeriapopulation);
		
		long wordpopulation = 4770478;
		System.out.printf("The world population is %,d%n",wordpopulation);
		
		float price = 577858.8474F;
		System.out.printf("The price of each iPhone per unit is %,.2f%n",price);
		
		double myBalance = 7464784747747474.8474747;
		System.out.printf("Your account balance is %c%,.2f%n",'$',myBalance);
		
		char symbol = '%';
		System.out.printf("There's an increament in the world's population by 20.5%c%n",symbol);
		
		boolean IsJavaFun = true;
		System.out.printf("Do you love JAVA? %b", IsJavaFun);
	}
}
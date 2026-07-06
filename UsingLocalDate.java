import java.time.LocalDate;

public class UsingLocalDate{
	public static void main(String[] args){
		LocalDate todaysDate = LocalDate.now();
		LocalDate myBirthDate = LocalDate.of(2009,6,29);
		LocalDate resumptionDate = LocalDate.parse("10-05-2026");
		 
		
		System.out.printf("Today's date is %s%n",todaysDate);
		System.out.printf("My birthday is %s%n",myBirthDate);
		System.out.printf("Resumption date is %s%n",resumptionDate);
	}
}
import java.util.Random;

public class AccountNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        
        
        String accountNumber = "000";
        
        
        for (int i = 0; i < 7; i++) {
            int digit = random.nextInt(10); 
            accountNumber += digit;         
        }
        
        
        System.out.println("Generated Account Number: " + accountNumber);
    }
}
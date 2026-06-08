import java.util.Random;

public class BasicPasswordGenerator {
    public static void main(String[] args) {
        String characterPool = "abcdefghijklmnopqrstuvwxyz" +  
                               "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +  
                               "0123456789" +                  
                               "!@#$%^&*()-_=+[]{}|;:,.<>/?";  
							   
        Random random = new Random();
        String password = ""; 
		
        for (int i = 0; i < 15; i++) {
            
            int randomIndex = random.nextInt(characterPool.length());
            
            
            password += characterPool.charAt(randomIndex);
        }

        
        System.out.println("Generated 15-Digit Password: " + password);
    }
}
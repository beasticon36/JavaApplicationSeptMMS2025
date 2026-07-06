import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UsingEmailSet {
    public static void main(String[] args) {
        Set<String> studentEmails = new HashSet<>();

        studentEmails.add("alice@example.com");
        studentEmails.add("bob@example.com");
        studentEmails.add("charlie@example.com");
        studentEmails.add("david@example.com");
        studentEmails.add("emma@example.com");
        studentEmails.add("charlie@example.com"); 

        System.out.println("Set: " + studentEmails);

        
        studentEmails.remove("david@example.com");

        
        System.out.println("After removing david@example.com: " + studentEmails);
		System.out.println("----------------------------------------");

        
        System.out.println("Displaying emails using enhanced for-loop:");
        for (String email : studentEmails) {
            System.out.println("Student Email: " + email);
		}
    }
}
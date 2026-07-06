import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {
    public static void main(String[] args) {
        
        // 1. Get the current time
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);
        
        // 2. Create a specific time (Hour, Minute, Second)
        LocalTime specificTime = LocalTime.of(14, 30, 0); // 2:30 PM
        System.out.println("Specific Time: " + specificTime);
        
        // 3. Time manipulation (Add/Subtract hours, minutes)
        LocalTime inTwoHours = now.plusHours(2);
        LocalTime thirtyMinsAgo = now.minusMinutes(30);
        System.out.println("Time in 2 hours: " + inTwoHours);
        System.out.println("Time 30 mins ago: " + thirtyMinsAgo);
        
        // 4. Extracting specific pieces of time
        int hour = now.getHour();
        int minute = now.getMinute();
        System.out.println("Hour: " + hour + " | Minute: " + minute);
        
        // 5. Formatting time (e.g., 12-hour clock with AM/PM)
        DateTimeFormatter amPmFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedTime = now.format(amPmFormatter);
        System.out.println("Formatted Time: " + formattedTime);
    }
}
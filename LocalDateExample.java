import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        
        // 1. Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);
        
        // 2. Create a specific date (Year, Month, Day)
        LocalDate specificDate = LocalDate.of(2026, 7, 1);
        System.out.println("Specific Date: " + specificDate);
        
        // 3. Date manipulation (Add/Subtract days, weeks, months)
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate lastMonth = today.minusMonths(1);
        System.out.println("Date next week: " + nextWeek);
        System.out.println("Date last month: " + lastMonth);
        
        // 4. Getting specific pieces of the date
        int year = today.getYear();
        String dayOfWeek = today.getDayOfWeek().toString();
        System.out.println("Current Year: " + year + " | Day of the week: " + dayOfWeek);
        
        // 5. Formatting a date to a custom pattern (e.g., DD-MM-YYYY)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
package days;

/**
 * Main class to print the week day names using the DayOfWeek enum.
 */
public class Days {
    public static void main(String[] args) {
        // Print all the day names using enums
        Weekdays weekdays = new Weekdays();
        for (DayOfWeek day : DayOfWeek.values()) {
            weekdays.nameOfDay(day);
        }
    }
}

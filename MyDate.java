import java.util.Calendar;
import java.util.Date;

public class MyDate {
    private int year;
    private int month; // 0-based
    private int day;

    // No-arg constructor
    public MyDate() {
        // Create a MyDate object for the current date
        Calendar calendar = Calendar.getInstance();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor with elapsed time
    public MyDate(long elapsedTime) {
        Date date = new Date(elapsedTime);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor with year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month; // month is 0-based
        this.day = day;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    // Method to set a new date using elapsed time
    public void setDate(long elapsedTime) {
        Date date = new Date(elapsedTime);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
}
public class MyDateTest {
    public static void main(String[] args) {
        // Create MyDate object using no-arg constructor
        MyDate currentDate = new MyDate();
        System.out.println("Current Date: " + currentDate.getYear() + "-" + 
                           (currentDate.getMonth() + 1) + "-" + 
                           currentDate.getDay());

        // Create MyDate object using elapsed time
        MyDate specificDate = new MyDate(34355555133101L);
        System.out.println("Specific Date: " + specificDate.getYear() + "-" + 
                           (specificDate.getMonth() + 1) + "-" + 
                           specificDate.getDay());
    }
}

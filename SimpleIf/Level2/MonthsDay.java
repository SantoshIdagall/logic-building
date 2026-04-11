package Level2;

public class MonthsDay {
     public static int getMonthDays(int month) {

        // February
        if (month == 2) return 28;

        // Months with 30 days
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        // Months with 31 days
        if (month >= 1 && month <= 12)
            return 31;

        // Invalid month
        return -1;
    }
    public static void main(String[] args) {

        int month = 2; // change value to test

        int days = getMonthDays(month);

        if (days == -1) {
            System.out.println("Invalid Month");
        } else {
            System.out.println("Number of days: " + days);
        }
    }
    
}

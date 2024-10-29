package Oct.ex_10102024;

public class TimeConstants {
    public static void main(String[] args) {
        final int HOURS_IN_DAY = 24;
        final int DAYS_IN_WEEK = 7;
        final int WEEKS_IN_YEARS = 52;

        int  hoursInYear = HOURS_IN_DAY * DAYS_IN_WEEK * WEEKS_IN_YEARS;
        System.out.println("Total hours in a Year: " + hoursInYear );

    }
}

package homework.lesson10;

public class Main {
    public static void main (String [] args) {
        System.out.println("Months of the year:");
        EnumMonths.Months [] monthsOfTheYear = EnumMonths.Months.values();
        EnumMonths.Months.printMonths(monthsOfTheYear);
        System.out.println("\n");

        System.out.println("Invoking isWeekDay and isHoliday for the indicated day");
        System.out.println(Weekday.TUESDAY.isWeekDay());
        System.out.println(Weekday.TUESDAY.isHoliday());
        System.out.println(Weekday.SATURDAY.isWeekDay());
        System.out.println(Weekday.SATURDAY.isHoliday());
    }
}

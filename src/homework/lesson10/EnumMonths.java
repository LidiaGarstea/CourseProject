package homework.lesson10;

class EnumMonths {

    public enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOMBER,
        NOVEMBER,
        DECEMBER;

        public static void printMonths(Months[] monthsOfTheYear) {
            for (int i = 0; i < monthsOfTheYear.length; i++) {
                System.out.println(monthsOfTheYear[i]);
            }
        }
    }
}
package Chp4_Reference_Type;

    /*

    Null
    1) can be used for Reference type
    2) can be used as Default value when Reference-type variable X point anything
    3) == != can be used

    int[] intArray = null;
    intArray[0] = 10 =>     NullPointerException

    String str = null;
    System.out.println(str.length());   => NullPointerException

    */
public class Enumeration {

    /*

    : to store Set of Constants     ex) weekdays, directions

        * Naming convention  :  Enum Constant should be CAPITAL

    */

        public enum Week {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {

        Week today = Week.SUNDAY;
        Week birthday = null;
        // Enum type : Reference type -> variable can use null literal
        Week myDay = Week.FRIDAY;

        switch (myDay) {
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best");
                break;
            default:
                System.out.println("Midweek days are so-so");
                break;
        }
    }
}

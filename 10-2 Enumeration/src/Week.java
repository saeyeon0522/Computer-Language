public class Week {
    public static void main(String[] args) {
        Day today = Day.FRI;

        switch (today) {
            case MON :
                System.out.println("Bad");
                break;
            case WED :
                // private String txt;
                System.out.println(today.name() + " is " + today.getText());
            case FRI : case SUN:
                System.out.println("Better");
                break;
            case SAT :
                // public String text
                System.out.println(today.name() + " is " + today.text);
                break;
            default  :
                System.out.println("SoSo");
                break;
        }

        for (Day day : Day.values()) {
            System.out.println(day.getCode());
            System.out.println(day.getText());
            System.out.println(day.name());
        }

        Day yesterday = Day.valueOf("THU");
        System.out.println(yesterday.getText());
    }
}

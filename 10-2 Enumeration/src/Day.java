public enum Day {
    MON(0, "NO"),
    TUE(1, "No"),
    WED(2, "no"),
    THU(3, "yes"),
    FRI(4, "Yes"),
    SAT(5, "YEs"),
    SUN(6, "YES");

    private int code;
    public String text;
    private String txt;
    Day(String text) { // constructor (private)
        System.out.println(this + " was called.");
        this.text = text; // assign custom messages
    }
    Day(int code, String text) {
        System.out.println(this + " was called");
        this.code = code;
        this.text = text;
    }
    public String getText() {return txt;}
    public int getCode() {return code;}
}

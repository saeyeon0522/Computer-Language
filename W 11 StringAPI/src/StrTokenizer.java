import java.util.StringTokenizer;

public class StrTokenizer {
    public static void main(String[] args) {
        String lang = "Java,Cpp&C#,Python,Javascript&Kotlin";

        // delimiter : ,
        StringTokenizer st1 = new StringTokenizer(lang, ",");
        System.out.println("There are " + st1.countTokens() + "tokens.");
        while (st1.hasMoreTokens()) System.out.println(st1.nextToken());

        // delimiter : & || ,
        StringTokenizer st2 = new StringTokenizer(lang, "&,");
        System.out.println("There are " + st2.countTokens() + "tokens.");
        while (st2.hasMoreTokens()) System.out.println(st2.nextToken());
    }
}

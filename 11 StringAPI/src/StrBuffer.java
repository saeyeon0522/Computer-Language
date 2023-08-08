import java.lang.StringBuffer;

public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");

        sb.append(" is pencil.");
        System.out.println(sb);

        sb.insert(7, "my"); // insert from 7th index
        System.out.println(sb);

        sb.replace(8, 10, "your"); // from start to end - 1
        System.out.println(sb);

        sb.delete(8, 13); // from start to end - 1
        System.out.println(sb);

        sb.setLength(4); // set new length
        System.out.println(sb);
    }
}

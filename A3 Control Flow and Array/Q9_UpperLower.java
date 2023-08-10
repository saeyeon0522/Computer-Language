import java.util.Scanner;

public class Q9_UpperLower {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your string:");
        String str = sc.next();
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') ch += 32;
            else if ('a' <= ch && ch <= 'z') ch -= 32;
            System.out.print(ch);
        }
        System.out.println();
        sc.close();
    }
}

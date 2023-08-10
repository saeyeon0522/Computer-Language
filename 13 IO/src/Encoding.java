import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encoding {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("Korean.txt");
            in = new InputStreamReader(fin, "utf-8");
            System.out.println("Encoding : " + in.getEncoding());

            int c;
            while ((c = in.read()) != -1) System.out.println((char)c);
            in.close();
            fin.close();
        } catch (IOException e) {System.out.println("IO Error");}
    }
}

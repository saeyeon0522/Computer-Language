import java.io.*;
import java.util.*;

public class FileScanner {
    public static void main(String[] args) {
        FileReader fin = null;
        try {
            fin = new FileReader("c:\\windows\\system.ini");
            Scanner scanner = new Scanner(fin);
            while (scanner.hasNext()) {
                String temp = scanner.nextLine();
                System.out.println(temp);
            }
        } catch (IOException e) {e.printStackTrace();}

        try {
            Scanner scanner = new Scanner(new File("c:\\windows\\system.ini"));
            while (scanner.hasNext()) {
                String temp = scanner.nextLine();
                System.out.println(temp);
            }
        } catch (IOException e) {e.printStackTrace();}
    }
}

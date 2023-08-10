import java.io.*;
import java.util.*;

public class FileWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fout = null;
        try {
            fout = new FileWriter("c:\\Temp\\test.txt");
            while(true) {
                String line = scanner.nextLine();
                if(line.length() == 0)
                    break;
                fout.write(line);
                fout.write("\r\n");
            }
            fout.close();
        } catch (IOException e) {System.out.println("IO Error");}
        scanner.close();
    }
}

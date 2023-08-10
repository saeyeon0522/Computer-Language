import java.io.*;
import java.util.*;

public class BufferedStream {
    public static void main(String[] args) {
        // Buffered Stream improves IO efficiency by reducing native IO operations
        FileReader fin = null;
        int c;
        try {
            fin = new FileReader("c:\\windows\\system.ini");
            BufferedOutputStream out = new BufferedOutputStream(System.out, 128);
            while ((c = fin.read()) != -1) out.write(c);
            new Scanner(System.in).nextLine();
            out.flush(); // flushing buffer
            out.close();
        } catch (IOException e) {e.printStackTrace();}
    }
}

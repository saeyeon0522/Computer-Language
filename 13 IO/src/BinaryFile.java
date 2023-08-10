import java.io.*;

public class BinaryFile {
    public static void main(String[] args) {
        // Writing Binary File
        byte b[] = {5, 22, -4, 29, 4, 14};
        try {
            FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
            for (int i = 0; i < b.length; i++) fout.write(b[i]);
        } catch (IOException e) { // binary data is not human-readable (not text)
            System.out.println("Can't save.");
        }
        System.out.println("saved.");

        // Reading Binary File
        try {
            FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
            int i = 0, c;
            while ((c = fin.read()) != -1) {
                b[i] = (byte) c;
                i++;
            }
            System.out.println("Print contents from test.out");
            for (int j = 0; j < b.length; j++) System.out.print(b[j] + " ");
            System.out.println();
            fin.close();
        } catch (IOException e) {System.out.println("Can't read");}
    }
}

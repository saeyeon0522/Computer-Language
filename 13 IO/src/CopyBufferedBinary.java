import java.io.*;

public class CopyBufferedBinary {
    public static void main(String[] args) {
        File src = new File("src.jpg");
        File dest = new File("dest.jpg");
        int c;
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);

            BufferedInputStream bi = new BufferedInputStream(fi);
            BufferedOutputStream bo = new BufferedOutputStream(fo);

            while ((c = bi.read()) != -1) bo.write((byte)c);

            bi.close(); bo.close();
            fi.close(); fo.close();
            System.out.println(src.getPath() + " copied to " + dest.getPath());
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}

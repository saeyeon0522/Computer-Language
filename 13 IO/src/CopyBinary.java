import java.io.*;

public class CopyBinary {
    public static void main(String[] args) {
        File src = new File("src.img");
        File dest = new File("dest.img");
        int c;
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            while ((c = fi.read()) != -1) fo.write((byte)c);
            fi.close();
            fo.close();
            System.out.println(src.getPath() + " copied to " + dest.getPath());
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}

import java.io.File;

public class FileManage {
    public static void listDirectory(File dir) {
        System.out.println("-----" + dir.getPath() + "-----");
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File f = files[i];
            long t = f.lastModified();
            System.out.print(f.getName());
            System.out.print("size : " + f.length());
            System.out.printf("modified time : %tb %td %ta %tT\n",t ,t ,t ,t);
        }
    }

    public static void main(String[] args) {
        File f1 = new File("c:\\windows\\system.ini");
        System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
        String res = "";
        if (f1.isFile()) res = "File";
        else if (f1.isDirectory()) res = "Directory";
        System.out.println(f1.getPath() + " is " + res);

        File f2 = new File("c:\\Temp\\sample");
        if (!f2.exists()) f2.mkdir();
        listDirectory(new File("c:\\Temp"));
        f2.renameTo(new File("c:\\Temp\\sample"));
        listDirectory(new File("c:\\Temp"));
    }
}

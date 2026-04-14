import java.io.*;

public class Q47_Merge_Two_Files_Into_Third {
    public static void main(String[] args) throws Exception {
        FileInputStream f1 = new FileInputStream("a.txt");
        FileInputStream f2 = new FileInputStream("b.txt");
        FileOutputStream f3 = new FileOutputStream("c.txt");

        int data;

        while ((data = f1.read()) != -1)
            f3.write(data);

        while ((data = f2.read()) != -1)
            f3.write(data);

        f1.close();
        f2.close();
        f3.close();
    }
}
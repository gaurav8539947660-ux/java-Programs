import java.io.*;

public class Q39_File_Copy_Using_Byte_Stream {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("a.txt");
        FileOutputStream out = new FileOutputStream("b.txt");

        int data;
        while ((data = in.read()) != -1) {
            out.write(data);
        }

        in.close();
        out.close();
    }
}
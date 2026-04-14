import java.io.*;

public class Q31_Read_File_With_IOException {

    static void readFile(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}
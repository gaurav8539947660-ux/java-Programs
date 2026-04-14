import java.io.*;

public class Q38_File_Character_Word_Line_Count {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        int charCount = 0, wordCount = 0, lineCount = 0;
        String line;

        while ((line = br.readLine()) != null) {
            lineCount++;
            charCount += line.length();
            wordCount += line.split(" ").length;
        }

        br.close();

        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
    }
}
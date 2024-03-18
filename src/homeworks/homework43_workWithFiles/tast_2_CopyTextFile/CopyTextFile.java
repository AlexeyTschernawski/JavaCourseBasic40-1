package homeworks.homework43_workWithFiles.tast_2_CopyTextFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\project\\homework 40.1\\src\\lessons\\lesson43\\tast_1_PrintTextFile\\file.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String path2 = "C:\\project\\homework 40.1\\src\\lessons\\lesson43\\tast_2_CopyTextFile\\newTextfile.txt";
        FileWriter fileWriter = new FileWriter(path2);


        String line;

        while ((line = bufferedReader.readLine()) != null) {
            fileWriter.write(line + "\n");
            System.out.println(line);

        }
        bufferedReader.close();
        fileWriter.close();

        System.out.println("File copied successfully.");
    }
}

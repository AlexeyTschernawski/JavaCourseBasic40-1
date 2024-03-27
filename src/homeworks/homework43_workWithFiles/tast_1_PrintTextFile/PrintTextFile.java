package homeworks.homework43_workWithFiles.tast_1_PrintTextFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintTextFile {
    public static void main(String[] args) throws IOException {


            String path = "C:\\project\\homework 40.1\\src\\lessons\\lesson43\\tast_1_PrintTextFile\\file.txt";

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                System.out.println(line);

            }
            bufferedReader.close();

        }
    }

package lessons.lesson43.tast_1_PrintTextFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.FilterWriter;
import java.io.IOException;

public class PrintTextFile {
    public static void main(String[] args) throws IOException {


            String path = "C:\\Users\\allex\\Desktop\\git\\JavaCourseBasic40-1\\src\\lessons\\lesson43\\file.txt";

            FileReader fileReader = new FileReader(path);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                System.out.println(line);

            }
            bufferedReader.close();

        }
    }

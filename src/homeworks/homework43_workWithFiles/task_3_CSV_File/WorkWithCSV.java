package homeworks.homework43_workWithFiles.task_3_CSV_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WorkWithCSV {
    public static void main(String[] args) throws IOException {

        String csvFile = "C:\\project\\homework 40.1\\src\\lessons\\lesson43" +
                        "\\task_3_CSV_File\\homework40.1.csv";

        String line;
        int sum = 0;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile));

        while ((line = bufferedReader.readLine()) != null) {
            // Разбиваем строку на поля, используя запятые в качестве разделителя
            String[] fields = line.split(",");

            // Проходим по каждому полю и суммируем числовые значения
            for (String field : fields) {
                try {
                    // Преобразуем поле в число и добавляем его к сумме
                    int num = Integer.parseInt(field.trim());
                    sum += num;
                } catch (NumberFormatException e) {
                    // Пропускаем поле, если оно не является числом
                }
            }
            System.out.println(line);
        }

        System.out.println("Total sum: " + sum);

    }
}

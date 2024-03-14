package homeworks.homework40.task_2_StreamOddNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersStream {
    public static void main(String[] args) {

        List<String> elementsForStream = Arrays.asList("Alex", "Thomas", "Herbert", "Jon", "Oliver");

        List<String> oddElements = elementsForStream.stream()
                .filter(str -> str.length() %2 !=0)
                .collect(Collectors.toList());


        System.out.println(oddElements);

    }
}

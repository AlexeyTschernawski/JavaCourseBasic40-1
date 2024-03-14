package homeworks.homework40.task_3_StringElementsStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionString {
    public static void main(String[] args) {

        List<String> collection = Arrays.asList("Alex", "Thomas", "Herbert", "Jon", "Oliver");

        List<String> allElements = collection.stream()
                .collect(Collectors.toList());

        System.out.println(allElements);
    }
}

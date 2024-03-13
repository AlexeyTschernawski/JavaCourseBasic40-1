package homeworks.homework38.task_6_TwoLists;

import java.util.ArrayList;
import java.util.List;

public class DemoTwoLitsts {
    public static void main(String[] args) {

        TwoListsInterface<String> twoLists = (list1, list2) -> {
            List<String> serviceList = new ArrayList(list1);
            serviceList.addAll(list2);
            return serviceList;
        };

        List<String> firstList = List.of("Alexey", "Oliver", "Thomas");
        List<String> secondList = List.of("Jeane", "Tom", "Melanie");

        List<String> result = twoLists.twoLists(firstList, secondList);

        System.out.println("first list: " + firstList);
        System.out.println("second list: " + secondList);
        System.out.println("two lists together: " + result);
    }
}
package homeworks.homework38.task_6_TwoLists;

import java.util.List;

@FunctionalInterface
public interface TwoListsInterface<LIS>{
    List<LIS> twoLists(List<LIS> list1, List<LIS> list2);
}

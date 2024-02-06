package homeworks.homework13.task1and2arrayRandomWithMethod;

public class ReplaceOddNumberwithZero {

    public void replaceOddWithZero(int[] workingArray) {
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] % 2 != 0) {
                workingArray[i] = 0;
            }
            System.out.print(workingArray[i] + ", ");
        }
        System.out.println();
    }

}

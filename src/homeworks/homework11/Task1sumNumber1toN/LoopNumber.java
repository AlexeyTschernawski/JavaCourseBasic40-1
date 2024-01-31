package homeworks.homework11.Task1sumNumber1toN;

public class LoopNumber {

    public int loop(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

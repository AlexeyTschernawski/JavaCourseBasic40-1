package homeworks.homework11.Task1sumNumber1toN;

public class Demo {
    public static void main(String[] args) {

        LoopNumber loopNumber = new LoopNumber();
        NumberInput numberInput = new NumberInput();

        int number = numberInput.numberN();
        int sum = loopNumber.loop(number);
        System.out.println(sum);

    }
}

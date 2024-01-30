package homeworks.homework9.biggestNumber;

public class BiggestNumberDemo {
    public static void main(String[] args) {

      InputNumber inputNumber = new InputNumber();

        System.out.println("---inter numbers-----");
        BiggestNumber0to100 inter4Numbers = inputNumber.inputNumbers();

        System.out.println("");
        inter4Numbers.printBiggestNumber();

        // Method from class FixNumbers
       FixNumbers numbers = new FixNumbers();

        BiggestNumber0to100 fixNumbers = numbers.numbers;
        fixNumbers.printBiggestNumber();

        //Methos from Math.max
        BiggestNumber0to100 MathMax = numbers.numbers;
        MathMax.Max();


    }
}

package homeworks.homework6.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {

        Operations operations = new Operations();
        InputNumbers input = new InputNumbers();

        System.out.print("Please inter first number: ");
        double firstNumber = input.inputDouble();

        System.out.print("Please inter second number: ");
        double secondNumber = input.inputDouble();

        System.out.println("operation result: ");
        System.out.println("Sum: " + Operations.sum(firstNumber,secondNumber));
        System.out.println("Substraction: " + Operations.sub(firstNumber,secondNumber));
        System.out.println("Multiplication: " + Operations.mul(firstNumber,secondNumber));
        System.out.println("Division: " + Operations.div(firstNumber,secondNumber));

    }
}

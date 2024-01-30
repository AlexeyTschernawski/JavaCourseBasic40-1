package lessons.lesson5;

public class CalculatorDemo {
    public static void main(String[] args) {

        CalculatorWithReturnResult calculatorWithReturnResult = new CalculatorWithReturnResult();

        int x = 10;
        int y = 5;

        int resultFromMethod = calculatorWithReturnResult.sum(x,y);
        System.out.println("Result of addition x = " + x + " and y = " + y + " will be equal " + resultFromMethod);

        int resultFromMethodSub = calculatorWithReturnResult.sub(x,y);
        System.out.println("Result of substraction x = " + x + " and y = " + y + " will be equal " + resultFromMethodSub);

        int resultFromMethodDiv = calculatorWithReturnResult.div(x,y);
        System.out.println("Result of substraction x = " + x + " and y = " + y + " will be equal " + resultFromMethodDiv);

        int resultFromMethodMul = calculatorWithReturnResult.mul(x,y);
        System.out.println("Result of substraction x = " + x + " and y = " + y + " will be equal " + resultFromMethodMul);
    }

}

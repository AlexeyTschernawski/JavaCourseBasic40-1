package homeworks.homework6.pizza;

public class PizzaDemo {
    public static void main(String[] args) {

       PizzaInputDates input = new PizzaInputDates();
       Pizza pizza1 = input.createPizza();
       Pizza pizza2 = input.createPizza();

       double extraCalories = pizza2.totalCaloriesInPizza() - pizza1.totalCaloriesInPizza();

        System.out.println("the amount of extra calories: " + extraCalories);
        System.out.println(pizza1.diameter);
    }
}

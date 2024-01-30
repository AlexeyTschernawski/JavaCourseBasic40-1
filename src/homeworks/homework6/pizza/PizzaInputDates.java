package homeworks.homework6.pizza;

import homeworks.homework6.scanner.UserInput;

public class PizzaInputDates {

    public Pizza createPizza(){
        UserInput input = new UserInput();

        int diameterPizza = input.inputInteger("Please enter first pizza diameter: ");
        int caloriesInOneCm = input.inputInteger("Please enter 1 cm pizza calories: ");

        Pizza NewPizza = new Pizza(diameterPizza, caloriesInOneCm);

        return NewPizza;

    }
}

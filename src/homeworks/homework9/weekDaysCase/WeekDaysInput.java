package homeworks.homework9.weekDaysCase;

import homeworks.homework6.scanner.UserInput;

public class WeekDaysInput {

    UserInput input = new UserInput();

    public int numberOfWeek(){
        int dayNumber = input.inputInteger("inter a number from 1 to 7: ");
        return dayNumber;
    }




}

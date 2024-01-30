package homeworks.homework9.weekDaysCase;

public class WeekDaysDemo {
    public static void main(String[] args) {

        WeekDaysInput weekDaysInput = new WeekDaysInput();
        WeekDaysSwischCase weekDaysSwischCase = new WeekDaysSwischCase();

        int dayNumber = weekDaysInput.numberOfWeek();
        String nameOfTheDay = weekDaysSwischCase.caseInput(dayNumber);
        System.out.println(nameOfTheDay);
    }
}

package homeworks.homework9.weekDaysCase;

public class WeekDaysSwischCase {


    public String caseInput(int day) {
        /*WeekDaysInput daysInput = new WeekDaysInput();
        int day = daysInput.numberOfWeek();*/
        String nameOfTheDay = "";

        switch (day) {
            case 1:
                nameOfTheDay = "Monday";
                break;
            case 2:
                nameOfTheDay ="Tuesday";
                break;
            case 3:
                nameOfTheDay = "Wednesday";
                break;
            case 4:
                nameOfTheDay =  "Thursday";
                break;
            case 5:
                nameOfTheDay = "Friday";
                break;
            case 6:
                nameOfTheDay = "Saturday";
                break;
            case 7:
                nameOfTheDay = "Sunday";
                break;
            default:
                System.out.println ("ERROR!!!");
        }
        return nameOfTheDay;
    }

}

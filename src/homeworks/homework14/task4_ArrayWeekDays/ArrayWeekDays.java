package homeworks.homework14.task4_ArrayWeekDays;



public class ArrayWeekDays {
    private String[] daysOfWeek;

    {
        // create array type String size 7
        daysOfWeek = new String[7];

        // note elements days of the week in array
        daysOfWeek[0] = "Monday";
        daysOfWeek[1] = "Tuesday";
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[3] = "Thursday";
        daysOfWeek[4] = "Friday";
        daysOfWeek[5] = "Saturday";
        daysOfWeek[6] = "Sunday";

    }

    public void printLastDayOfWeek() {
        System.out.println("Last day of the week: " + daysOfWeek[daysOfWeek.length - 1]);

    }
}


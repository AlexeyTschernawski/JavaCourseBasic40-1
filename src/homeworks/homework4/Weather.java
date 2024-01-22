package homeworks.homework4;

public class Weather {

    int Mon; int Tue; int Wed; int Thu; int Fri; int Sat; int Sun;

    public Weather(int mon, int tue, int wed, int thu, int fri, int sat, int sun) {
        Mon = mon;
        Tue = tue;
        Wed = wed;
        Thu = thu;
        Fri = fri;
        Sat = sat;
        Sun = sun;
    }

    public void AverageWeeklyTemperature (){
        int sum = Mon + Tue + Wed + Thu + Fri + Sat + Sun;
        int average = sum / 7;
        System.out.println("Average Weekly Temperature from Monday to Sunday in Rhein-Main Area : " + average);
    }
}

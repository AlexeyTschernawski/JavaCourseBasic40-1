package homeworks.homework4;

public class DemoClass {
    public static void main(String[] args) {

        ServiceClass myData = new ServiceClass("Alexey", 47, "Frankfurt");
        myData.printData();

        ServiceClass ArithmeticMean = new ServiceClass(0,1,2,3,4,5,6,7,8,9);
        ArithmeticMean.printArithmeticMean();

        Store store = new Store(1000, 500, 100);
        store.printPrices();

        Weather WeeklyTemperatureInMyCity = new Weather(+2, +1, -2, -3, -6, -5, -2);
        WeeklyTemperatureInMyCity.AverageWeeklyTemperature();
    }
}

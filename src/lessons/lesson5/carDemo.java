package lessons.lesson5;

public class carDemo {
    public static void main(String[] args) {

        Car myCar1 = new Car();
        myCar1.producer = "BMW";
        myCar1.model = "525S";
        myCar1.maxSpeed = 280;
        myCar1.engine = "Sport edition";

        Car myCar2 = new Car();
        myCar2.producer = "VW";
        myCar2.model = "Golf";
        myCar2.maxSpeed = 260;
        myCar2.engine = "GTI";

        myCar1.signal();
        myCar2.signal();

        myCar1.engineStart("let's drive");
        myCar2.engineStop();


    }
}

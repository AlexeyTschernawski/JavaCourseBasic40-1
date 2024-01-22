package lessons.lesson4;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class CarDemo {
    public static void main(String[] args) {

        Car myFirstCar = new Car("BMW", "5er",300);

        myFirstCar.printCarData();

        Car myCarWithConstructor = new Car("VW","Golf", 220);

        myCarWithConstructor.printCarData();


    }
}

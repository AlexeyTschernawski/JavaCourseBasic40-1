package lessons.lesson4;

public class Car {

    String model;

    String producer;

    int maxSpeed;


    public Car(String producer, String model, int maxSpeed) {
        this.model = model;
        this.producer = producer;
        this.maxSpeed = maxSpeed;
    }



    public void printCarData(){
        System.out.println("Vehicle Characteristics: " + " producer: " + producer + ", Model " + model + ", max speed: " + maxSpeed);
    }
}

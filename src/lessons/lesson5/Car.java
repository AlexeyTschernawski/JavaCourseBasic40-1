package lessons.lesson5;

public class Car {

    String model;
    String producer;
   public int maxSpeed;
   public String engine;

    public void signal (){
        System.out.println(" Vehicle " + model + " rings");
    }

    public void engineStart(String message) {
        System.out.println(message);
        System.out.println("Vehicle " + producer + " " + model + " started the engine");
        System.out.println("Vehicle: " + engine);
    }

    public void engineStop(){
        System.out.println("Vehicle " + producer + " " + model + " stoped engine");
    }
}

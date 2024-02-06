package homeworks.homework14.task5_PenArray;

public class PenDemo {
    public static void main(String[] args) {

        // create 3 object type Pen
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        Pen pen3 = new Pen();

        //save objects in array
        Pen[] L = {pen1,pen2,pen3};

        //change colors of pens from array
        L[0].setColor("Green");
        L[1].setColor("Red");
        L[2].setColor("Black");

        // print pens colors from array
        for (Pen pen: L) {
            System.out.println("Pen color: " + pen.getColor());
        }
    }
}

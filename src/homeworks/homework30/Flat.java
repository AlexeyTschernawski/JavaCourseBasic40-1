package homeworks.homework30;

public class Flat implements Comparable<Flat>{

    private int rooms;
    private double area;

    public Flat(int rooms, double area) {
        this.rooms = rooms;
        this.area = area;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "numberOfRooms=" + rooms +
                ", area=" + area +
                '}';
    }
    @Override
    public int compareTo(Flat flat) {

        int result = Integer.compare(this.rooms, flat.rooms);
        if (result == 0) {
            result = Double.compare(this.area, flat.area);
        }
        return result;
    }

}

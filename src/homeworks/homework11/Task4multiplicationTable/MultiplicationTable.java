package homeworks.homework11.Task4multiplicationTable;

public class MultiplicationTable {
    public static void main(String[] args) {

        int tableGroesse = 10;

        for (int i = 1; i <= tableGroesse; i++) {

            for (int x = 1; x <= tableGroesse; x++) {

                System.out.print(i * x + "\t");
            }
            System.out.println();
        }
    }
}

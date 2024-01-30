package homeworks.homework9.gradesWichtCase;

public class GradesWichtCase {


    public static void main(String[] args) {

        int random = (int) (Math.random() * 13);

        int tvTime = 0;

        if (random >= 10 && random <=12){
            tvTime = 60;
        }
        else if (random >= 7 && random <=9) {
            tvTime = 45;
        }
        else if (random >= 4 && random <=6) {
            tvTime = 30;
        }
        else if (random == 3) {
            tvTime = 15;
        }

        switch (random) {
            case 10,11,12:
                System.out.println("Grade: " + random + ", I am very happy" + " you can watch TV " + tvTime + " min");
                break;
            case 7,8,9:
                System.out.println("Grade: " + random + ", ok, good boy" + " you can watch TV " + tvTime + " min");
                break;
            case 4,5,6:
                System.out.println("Grade: " + random + ", hmmmm, ok" + " you can watch TV " + tvTime + " min");
                break;
            case 3:
                System.out.println("Grade: " + random + ", i am not happy" + " you can watch TV " + tvTime + " min");
                break;
            case 1,2:
                System.out.println("Grade: " + random + ", go away !!!! no TV today");
                break;

            default:
                System.out.println ("ERROR!!!");
        }

    }
}

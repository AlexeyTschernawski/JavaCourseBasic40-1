package lessons.lesson4;

public class CatDemo {
    public static void main(String[] args) {

        Cat myCat = new Cat();

        myCat.age = 5;
        myCat.catMeow();
        myCat.catBirthday();

        Cat mySecondCat = new Cat();

        mySecondCat.age = 15;
        mySecondCat.catMeow();
        mySecondCat.catBirthday();

    }
}

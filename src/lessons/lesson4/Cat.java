package lessons.lesson4;

public class Cat {

    int age;

    public void catMeow(){
        System.out.println("Meow!!!");
    }

    public void catBirthday(){

        System.out.println("my cat has today Birthday");
        System.out.println("she was " + age + " old");
        age = age + 1;
        System.out.println("and now she ist " + age + " old");
    }
}

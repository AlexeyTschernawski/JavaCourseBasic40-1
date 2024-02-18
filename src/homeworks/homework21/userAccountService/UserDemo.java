package homeworks.homework21.userAccountService;

import java.util.Arrays;

public class UserDemo {
    public static void main(String[] args) {

        User user1 = new User("cohort", "g40", "asd@gmx.de");
        User user2 = new User("cohort2", "g50", "yxc@gmx.de");

        user1.getEmail();
        user2.setPassword("g90");

        System.out.println("Password for user 2: " +user2.getPassword());
        System.out.println("Email for user 1: " + user1.getEmail());
        System.out.println();

        User[] users = new User[2];

        users[0] = new User("cohort", "g40", "asd@gmx.de");
        users[1] = new User("cohort2", "g50", "yxc@gmx.de");


        users[0].changePassword("g50", "g60");
        System.out.println(users[0].getPassword());
        users[1].changePassword("g50", "g90");
        System.out.println("na: " + users[1].getPassword());

        System.out.println("print all passwords: ");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getPassword());
        }


    }
}

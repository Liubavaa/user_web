package task1;

import task1.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Liubchykk", "ol@gmail.com", 18);
        user1.save();
        User user2 = new User("Oleg", "oleg@gmail.com", 17);
        user2.save();
    }
}
package task2;

import java.time.LocalDate;

public class Login {
    public static Client login(LoginMethod loginMethod) {
        if (loginMethod == LoginMethod.Twitter) {
            return new TwitterAdapter(new TwitterUser("dobosevych@gmail.com", "Ukraine", "2022-11-21"));
        } else if (loginMethod == LoginMethod.Facebook) {
            return new FacebookAdapter(new FacebookUser("dobosevych@gmail.com", Country.Ukraine, LocalDate.now()));
        }
        throw new IllegalArgumentException("No such loginMethod");
    }
}
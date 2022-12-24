package task2;

import java.time.LocalDate;

public class TwitterAdapter implements Client {
    private final TwitterUser user;

    public TwitterAdapter(TwitterUser twitterUser){
        user = twitterUser;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(user.getLastActiveTime());
    }
}

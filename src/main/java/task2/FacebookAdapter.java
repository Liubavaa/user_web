package task2;

import java.time.LocalDate;

public class FacebookAdapter implements Client {
    private final FacebookUser user;

    public FacebookAdapter(FacebookUser facebookUser){
        user = facebookUser;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry().toString();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return user.getGetUserActiveTime();
    }
}

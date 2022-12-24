package task2;

import java.util.Objects;

public class TestLogin {
    static {
        Client client1 = Login.login(LoginMethod.Facebook);
        Client client2 = Login.login(LoginMethod.Twitter);
        assert (Objects.equals(client1.getCountry(), client2.getCountry()));
        assert(Objects.equals(client1.getEmail(), client2.getEmail()));
    }
}

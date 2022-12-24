package task2;

import org.testng.annotations.Test;

import java.util.Objects;

import static org.testng.Assert.*;

public class LoginTest {
    @Test
    public void testLogin() {
        Client client1 = Login.login(LoginMethod.Facebook);
        Client client2 = Login.login(LoginMethod.Twitter);
        assert (Objects.equals(client1.getCountry(), client2.getCountry()));
        assert(Objects.equals(client1.getEmail(), client2.getEmail()));
    }
}
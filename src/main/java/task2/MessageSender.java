package task2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class MessageSender {
    public void sendOnEmail(String email, String text){}
    public void send(String text, Client client, String country){
        if (Objects.equals(client.getCountry(), country) & client.getLastActiveTime().isAfter(LocalDate.now().minus(1, ChronoUnit.HOURS))){
            sendOnEmail(client.getEmail(), text);
        }
    }
}
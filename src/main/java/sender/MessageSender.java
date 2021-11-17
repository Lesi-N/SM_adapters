package sender;

import java.util.Date;

public class MessageSender {
    public String send(User user, String text, String country) {
        Date cur_date = new Date();
        if (cur_date.getTime() - user.getActiveTime().getTime() <= 60 && country.equals(user.getCountry())) {
            System.out.println(String.format("Sent %s to %s", text, user.getUserEmail()));
            return String.format("Sent %s to %s", text, user.getUserEmail());
        }
        System.out.println("Unable to send");
        return String.format("Unable to send to %s", user.getUserEmail());
    }
}

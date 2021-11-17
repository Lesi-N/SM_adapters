package twitter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sender.MyTwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {
    TwitterUser twitterUser;
    MyTwitterUser myTwitterUser;

    @BeforeEach
    void setUp() {
        Date date = new Date();
        twitterUser = new TwitterUser("twitter@mail.com", "UK", date);
        myTwitterUser = new MyTwitterUser(twitterUser);
    }

    @Test
    void getUserEmail() {
        assertEquals(myTwitterUser.getUserEmail(), twitterUser.getUserMail());
    }

    @Test
    void getActiveTime() {
        assertEquals(myTwitterUser.getActiveTime(), twitterUser.getLastActiveTime());
    }

    @Test
    void getCountry() {
        assertEquals(myTwitterUser.getCountry(), twitterUser.getCountry());
    }
}
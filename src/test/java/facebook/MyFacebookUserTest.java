package facebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sender.MyFacebookUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    FacebookUser facebookUser;
    MyFacebookUser myFacebookUser;

    @BeforeEach
    void setUp() {
        Date date = new Date();
        facebookUser = new FacebookUser("facebook@mail.com", "USA", date);
        myFacebookUser = new MyFacebookUser(facebookUser);
    }

    @Test
    void getUserEmail() {
        assertEquals(myFacebookUser.getUserEmail(), facebookUser.getEmail());
    }

    @Test
    void getActiveTime() {
        assertEquals(myFacebookUser.getActiveTime(), facebookUser.getUserActiveTime());
    }

    @Test
    void getCountry() {
        assertEquals(myFacebookUser.getCountry(), facebookUser.getUserCountry());
    }
}
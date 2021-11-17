package sender;

import facebook.FacebookUser;

import java.util.Date;

public class MyFacebookUser implements User {
    private final FacebookUser user;
    public MyFacebookUser(FacebookUser facebookUser) {
        user = facebookUser;
    }

    @Override
    public String getUserEmail() {
        return user.getEmail();
    }

    @Override
    public Date getActiveTime() {
        return user.getUserActiveTime();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry();
    }
}

package sender;

import twitter.TwitterUser;

import java.util.Date;

public class MyTwitterUser implements User {
    private final TwitterUser user;
    public MyTwitterUser(TwitterUser twitterUser){
        user = twitterUser;
    }

    @Override
    public String getUserEmail() {
        return user.getUserMail();
    }

    @Override
    public Date getActiveTime() {
        return user.getLastActiveTime();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }
}

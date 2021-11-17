import facebook.FacebookUser;
import sender.MessageSender;
import sender.MyFacebookUser;
import sender.MyTwitterUser;
import twitter.TwitterUser;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date at1 = new Date();
        Date at2 = new Date();
        FacebookUser facebookUser = new FacebookUser("facebookexample@gmail.com", "Ukraine", at1);
        TwitterUser twitterUser = new TwitterUser("twitterexample@gmail.com", "USA", at2);

        MyFacebookUser myFacebookUser = new MyFacebookUser(facebookUser);
        MyTwitterUser myTwitterUser = new MyTwitterUser(twitterUser);

        MessageSender messageSender = new MessageSender();
        messageSender.send(myFacebookUser, "Hey!", "Ukraine");
        messageSender.send(myTwitterUser, "Hey!", "Ukraine");
    }
}

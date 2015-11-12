import twitter4j.*;
import twitter4j.auth.OAuth2Token;
import twitter4j.conf.*;


import java.util.ArrayList;
import java.util.Date;
import java.util.Map;


/**
 * Created by Smile on 16.10.15.
 */
public class GetFromTwitterAndTransform {

    private String twitterConsumerKey = "jX4DOu7B6xVkraPav70lKYlO2";
    private String twitterSecret = "Ypy8CQIaBJg3FN5OqXAJNkPewkN44bvZZ1NgcMgd6VQxFTwWFG";
    private String secondTwitterConsumerKey="XEn29uXFeMr1YR6buK7OOmQZd";
    private String secondTwitterSecret = "Q1fpcnSYlAsCPDROKyQS8eY1H9UkxBNoSnQseuCbuyykC8CNwV";


    GetFromTwitterAndTransform() {
    }



    ArrayList<Post> getFromTwitter(String hashtag, String startDate) { //date format yyyy-mm-dd
        OAuth2Token token = getOAuth2Token(1);
        ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setApplicationOnlyAuthEnabled(true);
        cb.setOAuthConsumerKey(twitterConsumerKey);
        cb.setOAuthConsumerSecret(twitterSecret);
        cb.setOAuth2TokenType(token.getTokenType());
        cb.setOAuth2AccessToken(token.getAccessToken());

        Twitter twitter = new TwitterFactory(cb.build()).getInstance();

        boolean trigger = true;
        long lastID = 0;

        ArrayList<Post> data = new ArrayList<>();
        while (trigger)
        {
            try
            {
                Map<String, RateLimitStatus> rateLimitStatus = twitter.getRateLimitStatus("search");
                RateLimitStatus searchTweetsRateLimit = rateLimitStatus.get("/search/tweets");
                /*System.out.printf("You have %d calls remaining out of %d, Limit resets in %d seconds\n",
                        searchTweetsRateLimit.getRemaining(),
                        searchTweetsRateLimit.getLimit(),
                        searchTweetsRateLimit.getSecondsUntilReset());*/

                Query q = new Query(hashtag);	// Search for tweets that contain these two words
                q.setCount(100);// Let's get all the tweets we can in one call
                q.resultType(Query.RECENT);

                if (lastID!=0)
                {
                    q.setMaxId(lastID-1);
                }
                //q.resultType("recent");						// Get all tweets
                //q.setLang("en");							// English language tweets, please

                QueryResult r = twitter.search(q);			// Make the call
                Status currentStatuc = null;
                for (Status s: r.getTweets())				// Loop through all the tweets...
                {
                    currentStatuc = s;
                    Date date = s.getCreatedAt();
                    String stringDate = (date.getYear()+1900)+"-"+date.getMonth()+ "-"+date.getDate();
                    //System.out.println(stringDate);
                    if (stringDate.compareTo(startDate)==0)
                    {
                        trigger = false;
                        break;
                    }
                    //System.out.println(stringDate);
                    /*System.out.printf("id:%d  At %s, @%-20s said:  %s\n",
                            s.getId(),
                            s.getCreatedAt().toString(),
                            s.getUser().getScreenName(),
                            s.getText());*/
                    data.add(new Post(s.getText(),stringDate));
                }
                if (currentStatuc==null)
                {
                    trigger=false;
                } else
                {
                    lastID=currentStatuc.getId();
                }
            }
            catch (Exception e)
            {
                //System.out.println("That didn't work well...wonder why?");

                //e.printStackTrace();
                trigger=false;
                if (data.size()==0)
                {
                    return reserveGetter(hashtag,startDate);
                }

            }
        }


        return data;
    }

    private ArrayList<Post> reserveGetter(String hashtag, String startDate)
    {
        OAuth2Token token = getOAuth2Token(2);
        ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setApplicationOnlyAuthEnabled(true);
        cb.setOAuthConsumerKey(secondTwitterConsumerKey);
        cb.setOAuthConsumerSecret(secondTwitterSecret);
        cb.setOAuth2TokenType(token.getTokenType());
        cb.setOAuth2AccessToken(token.getAccessToken());

        Twitter twitter = new TwitterFactory(cb.build()).getInstance();

        boolean trigger = true;
        long lastID = 0;

        ArrayList<Post> data = new ArrayList<>();
        while (trigger) {
            try {
                Map<String, RateLimitStatus> rateLimitStatus = twitter.getRateLimitStatus("search");
                RateLimitStatus searchTweetsRateLimit = rateLimitStatus.get("/search/tweets");
                /*System.out.printf("You have %d calls remaining out of %d, Limit resets in %d seconds\n",
                        searchTweetsRateLimit.getRemaining(),
                        searchTweetsRateLimit.getLimit(),
                        searchTweetsRateLimit.getSecondsUntilReset());*/

                Query q = new Query(hashtag);    // Search for tweets that contain these two words
                q.setCount(100);// Let's get all the tweets we can in one call
                q.resultType(Query.RECENT);

                if (lastID != 0) {
                    q.setMaxId(lastID - 1);
                }
                //q.resultType("recent");						// Get all tweets
                //q.setLang("en");							// English language tweets, please

                QueryResult r = twitter.search(q);            // Make the call
                Status currentStatuc = null;
                for (Status s : r.getTweets())                // Loop through all the tweets...
                {
                    currentStatuc = s;
                    Date date = s.getCreatedAt();
                    String stringDate = (date.getYear() + 1900) + "-" + date.getMonth() + "-" + date.getDate();
                    //System.out.println(stringDate);
                    if (stringDate.compareTo(startDate) == 0) {
                        trigger = false;
                        break;
                    }
                    //System.out.println(stringDate);
                    /*System.out.printf("id:%d  At %s, @%-20s said:  %s\n",
                            s.getId(),
                            s.getCreatedAt().toString(),
                            s.getUser().getScreenName(),
                            s.getText());*/
                    data.add(new Post(s.getText(), stringDate));
                }
                if (currentStatuc == null) {
                    trigger = false;
                } else {
                    lastID = currentStatuc.getId();
                }
            } catch (Exception e) {
                //System.out.println("That didn't work well...wonder why?");

                //e.printStackTrace();
                trigger = false;

            }
        }
        return data;

    }


    public  OAuth2Token getOAuth2Token(int number) {
        OAuth2Token token = null;
        ConfigurationBuilder cb;
        cb = new ConfigurationBuilder();
        cb.setApplicationOnlyAuthEnabled(true);
        if (number == 1)
        {
            cb.setOAuthConsumerKey(twitterConsumerKey);
            cb.setOAuthConsumerSecret(twitterSecret);
        } else
        {
            cb.setOAuthConsumerKey(secondTwitterConsumerKey);
            cb.setOAuthConsumerSecret(secondTwitterSecret);
        }
        try {
            token = new TwitterFactory(cb.build()).getInstance().getOAuth2Token();
        } catch (Exception e) {
            //System.out.println("Can't get OAuth2 token");
            //e.printStackTrace();
            System.exit(0);
        }
        //System.out.println(token.toString());
        return token;
    }




}

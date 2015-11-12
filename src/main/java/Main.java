
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Smile on 16.10.15.
 */
public class Main {

    public static void main(String[] args)
    {
        long millisStart = System.currentTimeMillis();
        String hashtag = args[0];
        String startDate = args[1];
        String[] date = startDate.split("-");
        int month = Integer.valueOf(date[1]).intValue()-1;
        startDate = date[0]+"-"+month+"-"+date[2];
        //System.out.println(startDate);
        GetFromTwitterAndTransform getFromTwitterAndTransform = new GetFromTwitterAndTransform();
        ArrayList<Post> data = getFromTwitterAndTransform.getFromTwitter(hashtag,startDate);
        //System.out.println("end getting, time spent:"+((System.currentTimeMillis()-millisStart)/1000));
        millisStart = System.currentTimeMillis();
        //System.out.println("tweets: "+data.size());
        if (data.size()==0)
        {
            System.out.println("Smth went wrong.");
            System.exit(1);
        }
        Alghoritm alghoritm = new TwitterAlghoritm();
        ArrayList<DataResult> dataResults = (ArrayList<DataResult>) alghoritm.doTheAlghoritm(data);
        //System.out.println("end algorithm, time spent:"+((System.currentTimeMillis()-millisStart)/1000));
        millisStart = System.currentTimeMillis();
        Iterator<DataResult> iterator = dataResults.iterator();
        /*while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }*/
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i<dataResults.size(); i++)
        {
            JSONObject object = new JSONObject();
            object.put("period",dataResults.get(i).getPeriod());
            object.put("scorePos",dataResults.get(i).getScorePos());
            object.put("scoreNeg",dataResults.get(i).getScoreNeg());
            jsonArray.add(object);

        }
        System.out.println(jsonArray.toString());
        System.exit(0);
    }

}

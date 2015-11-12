
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Smile on 16.10.15.
 */
public class TwitterAlghoritm extends Alghoritm {

    DictionaryOfWords dictionary;

    TwitterAlghoritm()
    {
        dictionary = new HardcodeDictionary();
    }



    @Override
    List<DataResult> doTheAlghoritm(ArrayList<Post> data) {

        ArrayList<DataResult> dataResults = new ArrayList<>(data.size());
        String currentDate=data.get(0).getPeriod();
        DataResult dataResult = new DataResult(0,0,currentDate);
        for (Post post : data)
        {
            post.setWords(parseText(post.getText()));
            check(post);
            if (post.getPeriod().equals(currentDate))
            {
                dataResult.setCount(dataResult.getCount()+1);
                dataResult.setScoreNeg(dataResult.getScoreNeg()+post.getScoreNeg());
                dataResult.setScorePos(dataResult.getScorePos()+post.getScorePos());
            } else
            {
                dataResults.add(dataResult);
                dataResult = new DataResult(post.getScorePos(), post.getScoreNeg(), post.getPeriod());
                currentDate = post.getPeriod();
                dataResult.setCount(dataResult.getCount()+1);
            }
            //System.out.println("Post text:"+post.getText()+" posScore:"+post.getScorePos()+" negScore:"+post.getScoreNeg());
            //todo : make result by date
        }
        dataResults.add(dataResult);
        return dataResults;
    }


    private ArrayList<String> parseText(String text)
    {
        StringBuilder sb = new StringBuilder();
        text = text.replaceAll("[\\p{P}\\p{S}]","");
        ArrayList<String> data = new ArrayList<String>();
        for (String s:text.split(" "))
        {
            data.add(s);
        }
        return data;
    }

    private void check(Post post)
    {

        for (String word :post.getWords())
        {
            int score = dictionary.returnScoreOfWord(word);
            if (score<0)
            {
                post.setScoreNeg(post.getScoreNeg()+score);
            } else
            {
                post.setScorePos(post.getScorePos()+score);
            }
        }
    }



}

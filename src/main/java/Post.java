import java.util.ArrayList;

/**
 * Created by Smile on 16.10.15.
 */
public class Post {
    private String text;
    private String period;
    private ArrayList<String> words;
    private int scorePos;
    private int scoreNeg;

    public Post(String text, String period) {
        this.text = text;
        this.period = period;
        words = null;
        scoreNeg = 0;
        scorePos=0;
    }


    public String getPeriod() {
        return period;
    }


    public int getScorePos() {
        return scorePos;
    }

    public int getScoreNeg() {
        return scoreNeg;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }

    public String getText() {
        return text;
    }

    public void setScoreNeg(int scoreNeg) {
        this.scoreNeg = scoreNeg;
    }

    public void setScorePos(int scorePos) {
        this.scorePos = scorePos;
    }

    public ArrayList<String> getWords() {
        return words;
    }
}

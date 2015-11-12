/**
 * Created by Smile on 16.10.15.
 */
public class DataResult {
    private long scorePos;
    private long scoreNeg;
    private String period;
    private int count;

    public DataResult(long scorePos, long scoreNeg, String period) {
        this.scorePos = scorePos;
        this.scoreNeg = scoreNeg;
        this.period = period;
        this.count = 0;
    }

    public long getScorePos() {
        return scorePos;
    }

    public long getScoreNeg() {
        return scoreNeg;
    }

    public String getPeriod() {
        return period;
    }

    public void setScorePos(long scorePos)
    {
        this.scorePos=scorePos;
    }
    public void setScoreNeg(long scoreNeg)
    {
        this.scoreNeg=scoreNeg;
    }


    @Override
    public String toString()
    {
        return "Period: "+ this.getPeriod() + " negScore:"+scoreNeg+" posScore:"+scorePos;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

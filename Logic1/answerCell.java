package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:37 AM
 */
public class answerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
        return !isAsleep && (!isMorning || isMom);
    }
}

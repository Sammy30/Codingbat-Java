package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:40 AM
 */
public class scoresIncreasing {
    public boolean scoresIncreasing(int[] scores){
        for(int count = 1; count < scores.length; count++){
            if(!(scores[count] >= scores[count-1])) return false;
        }
        return true;
    }
}

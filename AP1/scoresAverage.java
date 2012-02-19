package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:48 AM
 */
public class scoresAverage {
    public int scoresAverage(int[] scores){
        return Math.max(average(scores,0,scores.length/2), average(scores, scores.length/2, scores.length));
    }
    
    int average(int[] scores, int start, int end){
        int result = 0;
        for(int count = start; count < end; count++){
            result+=scores[count];
        }
        return result/(end-start);
    }
}

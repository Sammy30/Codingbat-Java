package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:45 AM
 */
public class scoresClump {
    public boolean scoresClump(int[] scores){
        for(int count = 0; count < scores.length-2; count++){
            if(scores[count] >= scores[count+1] -2 && scores[count] <= scores[count+1] +2
                    && scores[count] >= scores[count+2] -2 && scores[count] <= scores[count+2] +2) return true;
        }
        return false;
    }
}

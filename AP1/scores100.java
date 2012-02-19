package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:43 AM
 */
public class scores100 {
    public boolean scores100(int[] scores){
        for(int count = 0 ; count < scores.length -1 ; count++){
            if(scores[count] == scores[count+1] && scores[count] == 100) return true;
        }
        return false;
    }
}

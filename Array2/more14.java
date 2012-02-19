package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 3:16 AM
 */
public class more14 {
    public boolean more14(int[] nums){
        int ones = 0;
        int fours = 0;

        for(int a : nums){
            if(a == 1) ones++;
            else if(a == 4) fours++;
        }
        return ones > fours;
    }
}

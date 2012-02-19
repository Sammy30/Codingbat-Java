package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 4:17 AM
 */
public class twoTwo {
    public boolean twoTwo(int[] nums){
        boolean[] wasTwo = {false, false};
        for(int a : nums){
            if(a!=2 && wasTwo[0] && !wasTwo[1]) return false;
            wasTwo[1] = wasTwo[0];
            wasTwo[0] = a == 2;
        }
        return !(!wasTwo[1] && wasTwo[0]);
    }
}

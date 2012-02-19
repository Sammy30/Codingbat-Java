package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 3:19 AM
 */
public class no14 {
    public boolean no14(int[] nums){
        boolean isOne = false;
        boolean isFour = false;
        for(int a : nums){
            if(a == 1) isOne = true;
            if(a == 4) isFour = true;
            if(isOne && isFour) return false;
        }
        return true;
    }
}

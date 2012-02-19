package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 3:18 AM
 */
public class only14 {
    public boolean only14(int[] nums){
        for(int a : nums){
            if(!(a == 1 || a ==4)) return false;
        }
        return true;
    }
}

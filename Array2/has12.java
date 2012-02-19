package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 4:06 AM
 */
public class has12 {
    public boolean has12(int[] nums){
        boolean wasOne = false;
        for(int a : nums){
            if(wasOne && a == 2) return true;
            if(a == 1) wasOne = true;
        }
        return false;
    }
}

package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 3:14 AM
 */
public class lucky13 {
    public boolean lucky13(int[] nums){
        for(int a : nums){
            if(a == 1 || a == 3) return false;
        }
        return true;
    }
}

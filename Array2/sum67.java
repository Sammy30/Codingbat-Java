package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 3:08 AM
 */
public class sum67 {
    public int sum67(int[] nums){
        int result = 0;
        boolean was6 = false;
        for(int a : nums){
            if(was6){
                if(a==7) was6=false;
                continue;
            }
            if(a==6){
                was6 = true;
                continue;
            }
            result+=a;
        }
        return result;
    }
}

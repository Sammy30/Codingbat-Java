package Warmup2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/5/12
 * Time: 4:49 AM
 */
public class noTriples {
    public boolean noTriples(int[] nums){
        for(int counter = 0; counter < nums.length -2; counter++){
            if(nums[counter] == nums[counter+1] && nums[counter] == nums[counter+2]) return false;
        }
        return true;
    }
}

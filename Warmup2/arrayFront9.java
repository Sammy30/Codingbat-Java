package Warmup2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/5/12
 * Time: 3:28 AM
 */
public class arrayFront9 {
    public boolean arrayFront9(int[] nums){
        int length = (nums.length > 4) ? 4:nums.length;

        for(int counter = 0; counter < length; counter++){
            if (nums[counter]==9) return true;
        }
        return false;
    }
}

package Warmup2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/5/12
 * Time: 4:52 AM
 */
public class has271 {
    public boolean has271(int[] nums){
        for(int counter = 0; counter < nums.length -2; counter++){
            if(nums[counter+1] == nums[counter] +5 &&
                    nums[counter+2] >= nums[counter] -3 &&
                    nums[counter+2] <= nums[counter] +1) return true;
        }
        return false;
    }
}

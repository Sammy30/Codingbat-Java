package Recursion2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/18/12
 * Time: 3:08 AM
 */
public class groupSum6 {
    public boolean groupSum6(int start, int[] nums, int target){
        if(start >= nums.length) return target == 0;

        if(nums[start] == 6){
            return groupSum6(start + 1, nums, target - nums[start]);
        }else{
            return groupSum6(start + 1, nums, target - nums[start])
                    || groupSum6(start + 1, nums, target);
        }
    }
}

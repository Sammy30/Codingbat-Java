package Recursion2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/18/12
 * Time: 1:47 AM
 */
public class groupSum {
    public boolean groupSum(int start, int[] nums, int target){
        if(start >= nums.length) return target == 0;

        return groupSum(start + 1, nums, target - nums[start])
                || groupSum(start + 1, nums, target);
    }
}

package Recursion2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/18/12
 * Time: 3:13 AM
 */
public class groupNoAdj {
    public boolean groupNoAdj(int start, int[] nums, int target){
        if(start >= nums.length) return target == 0;

        return groupNoAdj(start + 2, nums, target - nums[start])
                || groupNoAdj(start + 1, nums, target);
    }
}

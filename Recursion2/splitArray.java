package Recursion2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/18/12
 * Time: 3:33 AM
 */
public class splitArray {
    public boolean splitArray(int[] nums){
        return arrCheck(0, nums, 0);
    }

    public boolean arrCheck(int start, int[] nums, int tot){
        if(start >= nums.length) return tot == 0;
        if(arrCheck(start+1, nums, tot+nums[start])) return true;
        if(arrCheck(start+1, nums, tot-nums[start])) return true;
        return false;
    }
}

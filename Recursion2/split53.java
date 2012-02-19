package Recursion2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/18/12
 * Time: 4:12 AM
 */
public class split53 {
    public boolean split53(int[] nums){
        return splitter(0, nums, 0);
    }

    public boolean splitter(int start, int[] nums, int tot){
        if(start >= nums.length) return tot == 0;

        if(nums[start]%5 == 0){
            return splitter(start+1, nums, tot+nums[start]);
        }else{
            if(nums[start]%3 == 0){
                return splitter(start+1, nums, tot-nums[start]);
            }else{
                if(splitter(start+1, nums, tot+nums[start])) return true;
                if(splitter(start+1, nums, tot-nums[start])) return true;
            }
        }
        return false;
    }
}

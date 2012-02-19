package Recursion2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/18/12
 * Time: 4:07 AM
 */
public class splitOdd10 {
    public boolean splitOdd10(int[] nums){
        return splitter(0,nums,0,0);
    }
    
    public boolean splitter(int start, int[] nums, int tens, int odd){
        if(start >= nums.length) return tens%10 == 0 && odd %2 == 1;
        if(splitter(start+1, nums, tens+nums[start], odd)) return true;
        if(splitter(start+1, nums, tens, odd+nums[start])) return true;
        return false;
    }
}

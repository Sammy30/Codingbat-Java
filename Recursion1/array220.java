package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:08 PM
 */
public class array220 {
    public boolean array220(int[] nums, int index){
        return index < nums.length - 1 && (nums[index] * 10 == nums[index + 1] || array220(nums, index + 1));
    }
}

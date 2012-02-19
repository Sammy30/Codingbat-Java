package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:03 PM
 */
public class array6 {
    public boolean array6(int[] nums, int index){
        return index < nums.length && (nums[index] == 6 || array6(nums, index + 1));
    }
}

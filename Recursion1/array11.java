package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:06 PM
 */
public class array11 {
    public int array11(int[] nums, int index){
        if(index >= nums.length) return 0;
        if(nums[index] == 11) return 1 + array11(nums, index+1);
        return array11(nums, index+1);
    }
}

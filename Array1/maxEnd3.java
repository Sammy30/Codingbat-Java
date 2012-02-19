package Array1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:17 AM
 */
public class maxEnd3 {
    public int[] maxEnd3(int[] nums){
        nums[0] = Math.max(nums[0], nums[2]);
        nums[1] = nums[0];
        nums[2] = nums[0];
        return nums;
    }
}

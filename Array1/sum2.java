package Array1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:19 AM
 */
public class sum2 {
    public int sum2(int[] nums){
        if(nums.length == 0) return 0;
        return (nums.length == 1) ? nums[0] : nums[0] + nums[1];
    }
}

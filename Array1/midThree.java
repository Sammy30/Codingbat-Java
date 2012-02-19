package Array1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:54 AM
 */
public class midThree {
    public int[] midThree(int[] nums){
        return new int[] {nums[nums.length/2 -1], nums[nums.length/2], nums[nums.length/2 +1]};
    }
}

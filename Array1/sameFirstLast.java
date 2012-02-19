package Array1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:10 AM
 */
public class sameFirstLast {
    public boolean sameFirstLast(int[] nums){
        return nums.length >= 1 && nums[0] == nums[nums.length-1];
    }
}

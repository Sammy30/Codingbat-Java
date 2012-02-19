package Array1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:26 AM
 */
public class makeLast {
    public int[] makeLast(int[] nums){
        int[] result = new int[nums.length *2];
        result[result.length-1] = nums[nums.length-1];
        return result;
    }
}

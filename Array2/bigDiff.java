package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 3:01 AM
 */
public class bigDiff {
    public int bigDiff(int[] nums){
        int small = nums[0];
        int large = nums[0];
        
        for(int a : nums){
            small = Math.min(a, small);
            large = Math.max(a, large);
        }
        return large - small;
    }
}

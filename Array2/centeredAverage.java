package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 3:03 AM
 */
public class centeredAverage {
    public int centeredAverage(int[] nums){
        int small = nums[0];
        int large = nums[0];
        int result = 0;
        for(int a : nums){
            result+=a;
            small = Math.min(a, small);
            large = Math.max(a, large);
        }
        result-=small+large;
        result/=nums.length-2;
        return result;
    }
}

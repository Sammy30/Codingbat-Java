package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 3:55 AM
 */
public class matchUp {
    public int matchUp(int[] nums, int[] nums2){
        int result = 0;
        for(int count = 0; count < nums.length; count++){
            if(nums[count] != nums2[count]
                    && (nums[count] >= nums2[count] -2
                    & nums[count] <= nums2[count] +2)){
                result++;
            }
        }
        return result;
    }
}

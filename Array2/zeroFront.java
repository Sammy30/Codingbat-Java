package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 9:13 AM
 */
public class zeroFront {
    public int[] zeroFront(int[] nums){
        int lastZero = 0;
        for(int count = 0; count < nums.length; count++){
            if(nums[count] == 0){
                nums[count] = nums[lastZero];
                nums[lastZero] = 0;
                lastZero++;
            }
        }
        return nums;
    }
}

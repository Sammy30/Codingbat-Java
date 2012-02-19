package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 3:27 AM
 */
public class evenOdd {
    public int[] evenOdd(int[] nums){
        int lastEven = 0;
        for(int count = 0; count < nums.length; count++){
            if(nums[count]%2 == 0){
                int temp = nums[count];
                nums[count] = nums[lastEven];
                nums[lastEven] = temp;
                lastEven++;
            }
        }
        return nums;
    }
}

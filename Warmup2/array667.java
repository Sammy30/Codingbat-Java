package Warmup2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/5/12
 * Time: 4:46 AM
 */
public class array667 {
    public int array667(int[] nums){
        int result = 0;
        for(int counter = 0; counter < nums.length-1; counter++){
            if(nums[counter] == 6 && nums[counter+1] == 6 | nums[counter+1] ==7) result++;
        }
        return result;
    }
}

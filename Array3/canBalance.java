package Array3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/16/12
 * Time: 4:26 AM
 */
public class canBalance {
    public boolean canBalance(int[] nums){
        if(nums.length < 2) return false;
        
        int sum1 = 0;
        for(int count = 0; count < nums.length; count++){
            sum1 += nums[count];
            int sum2 = 0;
            for(int coun2 = count+1; coun2 < nums.length; coun2++){
                sum2 += nums[coun2];
            }
            if(sum1 == sum2) return true;
        }
        return false;
    }
}

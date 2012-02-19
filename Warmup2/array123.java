package Warmup2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/5/12
 * Time: 3:33 AM
 */
public class array123 {
    public boolean array123(int[] nums){
        for(int counter = 0; counter < nums.length-2; counter++){
            if (nums[counter] == 1 && nums[counter+1] == 2 && nums[counter+2] ==3) return true;
        }
        return false;
    }
}

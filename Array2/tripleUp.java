package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 4:56 AM
 */
public class tripleUp {
    public boolean tripleUp(int[] nums){
        for(int count = 0; count < nums.length-2; count++){
            if(nums[count]+2== nums[count+1]+1
                    && nums[count]+2==nums[count+2]) return true;
        }
        return false;
    }
}

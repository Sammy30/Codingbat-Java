package Array3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:32 AM
 */
public class countClumps {
    public int countClumps(int[] nums){
        if(nums.length < 2) return 0;

        int result = 0;
        boolean same = false;
        for(int count = 0; count < nums.length-1; count++){
            if(same && nums[count] != nums[count+1]) same = false;
            else if(!same && nums[count] == nums[count+1]){
                same = true;
                result++;
            }
        }
        return result;
    }
}

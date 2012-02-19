package Array1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:33 AM
 */
public class fix23 {
    public int[] fix23(int[] nums){
        for(int counter = 0; counter < 2; counter++){
            if(nums[counter] == 2 && nums[counter+1] == 3) nums[counter+1] = 0;
        }
        return nums;
    }
}

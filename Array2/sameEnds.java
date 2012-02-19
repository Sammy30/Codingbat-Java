package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 4:47 AM
 */
public class sameEnds {
    public boolean sameEnds(int[] nums, int len){
        for(int count = 0; count < len; count++){
            if(nums[count] != nums[nums.length-len+count]) return false;
        }
        return true;
    }
}

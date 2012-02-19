package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 5:27 AM
 */
public class shiftLeft {
    public int[] shiftLeft(int[] nums){
        int[] result = new int[nums.length];
        if(result.length == 0) return result;
        for(int count = 1; count < nums.length; count++){
            result[count-1] = nums[count];
        }
        result[result.length-1] = nums[0];
        return result;
    }
}

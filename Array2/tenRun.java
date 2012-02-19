package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 5:31 AM
 */
public class tenRun {
    public int[] tenRun(int[] nums){
        int tens = -1;
        int[] result = new int[nums.length];
        for(int count = 0; count < nums.length; count++){
            if(nums[count]%10==0){
                tens = nums[count];
                result[count] = tens;
                continue;
            }
            if(tens == -1){
                result[count] = nums[count];
                continue;
            }
            result[count] = tens;
        }
        return result;
    }
}

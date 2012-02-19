package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:22 AM
 */
public class copyEvens {
    public int[] copyEvens(int[] nums, int count){
        int[] result = new int[count];
        int index = 0;
        for(int counter = 0; counter < nums.length && index < result.length; counter++){
            if(nums[counter]%2 == 0){
                result[index] = nums[counter];
                index++;
            }
        }
        return result;
    }
}

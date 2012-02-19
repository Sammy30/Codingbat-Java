package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 8:06 AM
 */
public class post4 {
    public int[] post4(int[] nums){
        int lastFour = 0;
        for(int count = nums.length-1; count > -1; count--){
            if(nums[count] == 4){
                lastFour = count;
                break;
            }
        }
        int[] result = new int[nums.length-1-lastFour];
        for(int count = lastFour+1; count < nums.length; count++){
            result[count - lastFour -1]
                    =nums[count];
        }
        return result;
    }
}

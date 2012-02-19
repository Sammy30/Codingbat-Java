package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 6:02 AM
 */
public class pre4 {
    public int[] pre4(int[] nums){
        int firstFour = 0;
        
        for(int count = 0; count < nums.length; count++){
            if(nums[count] == 4){
                firstFour = count;
                break;
            }
        }
        
        int[] result = new int[firstFour];
        for(int count = 0; count < firstFour; count++){
            result[count] = nums[count];
        }
        return result;
    }
}

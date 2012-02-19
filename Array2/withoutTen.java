package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 3:03 AM
 */
public class withoutTen {
    public int[] withoutTen(int[] nums){
        int resultPos = 0;
        for(int count = 0; count < nums.length; count++){
            if(nums[count] != 10){
                int temp = nums[count];
                nums[count] = 0;
                nums[resultPos] = temp;
                resultPos++;
            }else{
                nums[count] = 0;
            }
        }
        return nums;
    }
}

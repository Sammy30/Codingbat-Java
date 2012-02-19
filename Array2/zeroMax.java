package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 3:18 AM
 */
public class zeroMax {
    public int[] zeroMax(int[] nums){
        if(nums.length == 0) return nums;
        int largestOdd = (nums[nums.length-1] % 2 == 1) ? nums[nums.length-1] : 0;
        
        for(int count = nums.length-2; count > -1; count--){
            if(nums[count] == 0) nums[count] = largestOdd;
            else{
                if(nums[count]%2 == 1) largestOdd = Math.max(largestOdd, nums[count]);
            }
        }
        return nums;
    }
}

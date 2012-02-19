package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 9:00 AM
 */
public class notAlone {
    public int[] notAlone(int[] nums, int val){
        if(nums.length < 3) return nums;
        int[] result = new int[nums.length];
        result[0] = nums[0];
        result[nums.length-1] = nums[nums.length-1];
        for(int count = 1; count < nums.length; count++){
            if(nums[count] == val && count != nums.length-1
                    && nums[count-1] != nums[count] && nums[count+1] != nums[count]){
                result[count] = Math.max(nums[count-1],nums[count+1]);
                continue;
            }
            result[count] = nums[count];
        }
        return result;
    }
}

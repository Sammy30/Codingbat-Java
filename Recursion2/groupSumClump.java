package Recursion2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/18/12
 * Time: 3:18 AM
 */
public class groupSumClump {
    public boolean groupSumClump(int start, int[] nums, int target){
        if(start >= nums.length) return target == 0;

        int val = nums[start];
        int loooong = 1;
        for(int count = start; count < nums.length-1; count++){
            if(nums[count]!=nums[count+1]){
                loooong = 1 + count - start;
                val = loooong * val;
                break;
            }
        }

        return groupSumClump(start + loooong, nums, target - val)
                || groupSumClump(start + loooong, nums, target);
    }
}

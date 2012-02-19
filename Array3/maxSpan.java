package Array3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/16/12
 * Time: 3:32 AM
 */
public class maxSpan {
    public int maxSpan(int[] nums){
        if(nums.length < 2) return nums.length;

        int span = 1;
        for(int count = 0; count < nums.length; count++){

            for(int last = nums.length-1; last > count; last--){
                if(nums[last] == nums[count]){
                    span = Math.max(span,1+last-count);
                    break;
                }
            }
        }
        return span;        
    }
}

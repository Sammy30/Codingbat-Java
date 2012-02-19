package Array3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 3:29 AM
 */
public class maxMirror {
    public int maxMirror(int[] nums){
        if(nums.length < 2) return nums.length;
        
        int result = 1;
        for(int start = 0; start < nums.length; start++){
            int length = 0;
            for(int end = nums.length -1; end > -1; end--){
                if(start+length < nums.length
                        &&nums[start + length] == nums[end]){
                    length++;
                }else{
                    length = 0;
                }
                result = Math.max(result, length);
            }
        }
        return result;
    }
}

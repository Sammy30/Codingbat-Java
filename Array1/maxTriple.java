package Array1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:57 AM
 */
public class maxTriple {
    public int maxTriple(int[] nums){
        int largest = nums[0];
        if(nums[nums.length/2] > largest) largest = nums[nums.length/2];
        if(nums[nums.length-1] > largest) largest = nums[nums.length-1];
        return largest;
    }
}

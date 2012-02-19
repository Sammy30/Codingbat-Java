package Array1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 5:04 AM
 */
public class frontPiece {
    public int[] frontPiece(int[] nums){
        if(nums.length < 2) return nums;
        return new int[] {nums[0], nums[1]};
    }
}

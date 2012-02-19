package Array3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/16/12
 * Time: 3:53 AM
 */
public class fix34 {
    public int[] fix34(int[] nums){
        if(nums.length < 3) return nums;
        for(int count = 0; count < nums.length-1; count++){
            if(nums[count] == 3 && nums[count+1] !=4){
                for(int fours = 1; fours < nums.length; fours++){
                    if(nums[fours-1] != 3 && nums[fours] == 4){
                        int temp = nums[count+1];
                        nums[count+1] = 4;
                        nums[fours] = temp;
                    }
                }
            }
        }
        return nums;
    }
}

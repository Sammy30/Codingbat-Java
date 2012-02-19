package Array3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/16/12
 * Time: 4:19 AM
 */
public class fix45 {
    public int[] fix45(int[] nums){
        if(nums.length < 2) return nums;
        for(int count = 0; count < nums.length-1; count++){
            if(nums[count] == 4 && nums[count+1] !=5){
                for(int fives = 0; fives < nums.length; fives++){
                    if((fives == 0 || nums[fives-1] != 4)&& nums[fives] == 5){
                        int temp = nums[count+1];
                        nums[count+1] = 5;
                        nums[fives] = temp;
                    }
                }
            }
        }
        return nums;
    }
}

package Warmup2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/5/12
 * Time: 3:26 AM
 */
public class arrayCount9 {
    public int arrayCount9(int[] nums){
        int result = 0;
        for(int i: nums){
            if(i == 9) result++;
        }
        return result;
    }
}

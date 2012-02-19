package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 3:24 AM
 */
public class isEverywhere {
    public boolean isEverywhere(int[] nums, int val){
        boolean isEverywhere = true;
        for(int a : nums){
            if(isEverywhere){
                if(a == val) {
                }
                else{
                    isEverywhere = false;
                }
            }else{
                if(a == val){
                    isEverywhere = true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}

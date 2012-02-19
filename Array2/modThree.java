package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 4:09 AM
 */
public class modThree {
    public boolean modThree(int[] nums){
        boolean[] wasEven = {true,false};

        for(int a : nums){
            if(a%2 == 0){
                if(wasEven[0] && wasEven[1]) return true;
                wasEven[1] = wasEven[0];
                wasEven[0] = true;
            }else{
                if(!wasEven[0] && !wasEven[1]) return true;
                wasEven[1] = wasEven[0];
                wasEven[0] = false;
            }
        }
        return false;
    }
}

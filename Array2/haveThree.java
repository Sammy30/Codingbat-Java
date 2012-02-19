package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 4:15 AM
 */
public class haveThree {
    public boolean haveThree(int[] nums){
        boolean wasThree = false;
        int threeTot = 0;
        for(int a : nums){
            if(a == 3){
                if(wasThree) return false;
                wasThree = true;
                threeTot++;
            }else{
                wasThree = false;
            }
        }
        return threeTot == 3;
    }
}

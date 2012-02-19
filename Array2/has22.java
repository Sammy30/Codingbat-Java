package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 3:12 AM
 */
public class has22 {
    public boolean has22(int[] nums){
        boolean was2 = false;
        for(int a : nums){
            if(was2 && a == 2) return true;
            if(a == 2){
                was2 = true;
                continue;
            }
            if(was2){
                was2 = false;
            }
        }
        return false;
    }
}

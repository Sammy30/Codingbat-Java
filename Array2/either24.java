package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 3:29 AM
 */
public class either24 {
    public boolean either24(int[] nums){
        boolean twoTwos = false;
        boolean twoFours = false;
        
        boolean was2 = false;
        boolean was4 = false;
        
        for(int a : nums){
            if(was2){
                if(a == 2){
                    twoTwos = true;
                }
                was2 = false;
                continue;
            }
            if(was4){
                if(a == 4){
                    twoFours = true;
                }
                was4 = false;
                continue;
            }
            if(a == 2) was2 = true;
            if(a == 4) was4 = true;
        }
        return twoTwos ^ twoFours;
    }
}

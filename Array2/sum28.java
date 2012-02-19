package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 3:15 AM
 */
public class sum28 {
    public boolean sum28(int[] nums){
        int tot = 0;
        for(int a : nums){
            if(a == 2) tot+=2;
        }
        return tot == 8;
    }
}

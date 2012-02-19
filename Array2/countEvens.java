package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 2:59 AM
 */
public class countEvens {
    public int countEvens(int[] nums){
        int result = 0;
        for(int a: nums){
            if(a%2==0) result++;
        }
        return result;
    }
}

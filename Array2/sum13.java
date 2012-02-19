package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 3:05 AM
 */
public class sum13 {
    public int sum13(int[] nums){
        int result = 0;
        boolean was13 = false;
        for(int a : nums){
            if(a==13){
                was13 = true;
                continue;
            }
            if(was13){
                was13 = false;
                continue;
            }
            result+=a;
        }
        return result;
    }
}

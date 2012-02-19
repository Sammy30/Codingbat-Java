package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:27 AM
 */
public class copyEndy {
    public int[] copyEndy(int[] nums, int count){
        int[] result = new int[count];
        int index = 0;
        for(int a : nums){
            if(isEndy(a)){
                result[index] = a;
                if(++index >= result.length) break;
            }
        }
        return result;
    }
    
    public boolean isEndy(int n){
        return ((n >= 0 && n <= 10) || (n >= 90 && n <= 100));
    }
}

package Array3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/16/12
 * Time: 6:13 AM
 */
public class seriesUp {
    public int[] seriesUp(int n){
        int[] result = new int[n*(n+1)/2];
        int iter = 0;
        for(int count = 1; count <= n; count++){
            for(int innerCount = 1; innerCount <= count; innerCount++){
                result[iter] = innerCount;
                iter++;
            }
        }
        return result;
    }
}

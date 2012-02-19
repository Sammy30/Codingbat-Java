package Array1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 5:14 AM
 */
public class make2 {
    public int[] make2(int[] a, int[] b){
        int[] result = new int[2];
        
        int temp = 0;
        
        while(temp < a.length && temp < result.length){
            result[temp] = a[temp];
            temp++;
        }
        while(temp - a.length < b.length && temp < result.length){
            result[temp] = b[temp-a.length];
            temp++;
        }

        return result;
    }
}

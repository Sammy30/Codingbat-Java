package Array1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:43 AM
 */
public class biggerTwo {
    public int[] biggerTwo(int[] a, int[] b){
        if(a[0] + a[1] >= b[0] + b[1]) return a;
        return b;
    }
}

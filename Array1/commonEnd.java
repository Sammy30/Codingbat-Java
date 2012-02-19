package Array1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:12 AM
 */
public class commonEnd {
    public boolean commonEnd(int[] a, int[] b){
        return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);
    }
}

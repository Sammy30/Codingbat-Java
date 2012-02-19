package Array1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:35 AM
 */
public class start1 {
    public int start1(int[] a, int[] b){
        if(a.length == 0 && b.length == 0) return 0;
        if(a.length == 0 && b[0] == 1 ) return 1;
        if(a.length == 0) return 0;
        if(b.length == 0 && a[0] == 1) return 1;
        if(b.length == 0) return 0;

        if(a[0] == 1 && b[0] == 1) return 2;
        if(a[0] == 1 || b[0] == 1) return 1;
        return 0;
    }
}

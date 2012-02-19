package Logic2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:55 PM
 */
public class loneSum {
    public int loneSum(int a, int b, int c){
        if(a == b && a == c) return 0;
        if(a == b) return c;
        if(a == c) return b;
        if(b == c) return a;
        return a + b + c;
    }
}

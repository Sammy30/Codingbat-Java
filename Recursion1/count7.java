package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:41 PM
 */
public class count7 {
    public int count7(int n){
        if(n == 0) return 0;
        return ((n%10 == 7) ? 1 : 0) + count7(n/10);
    }
}

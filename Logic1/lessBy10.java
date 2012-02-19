package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 2:50 PM
 */
public class lessBy10 {
    public boolean lessBy10(int a, int b, int c){
        return a >= b + 10 || a >= c + 10 || b >= a + 10 || b >= c + 10 || c >= a + 10 || c >= b + 10
                || a <= b - 10 || a <= c - 10 || b <= a -10 || b <= c - 10 || c <= a -10 || c <= b - 10;
    }
}

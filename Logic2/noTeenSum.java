package Logic2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:01 PM
 */
public class noTeenSum {
    public int noTeenSum(int a, int b, int c){
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n){
        if(n == 13 || n == 14 || n >= 17 && n <= 19) return 0;
        return n;
    }
}
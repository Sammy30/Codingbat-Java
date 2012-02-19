package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:31 AM
 */
public class teenSum {
    public int teenSum(int a, int b){
        if(a >= 13 && a <= 19 || b >= 13 && b <= 19) return 19;
        return a+b;
    }
}

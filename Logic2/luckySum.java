package Logic2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:59 PM
 */
public class luckySum {
    public int luckySum(int a, int b, int c){
        if(a == 13) return 0;
        if(b == 13) return a;
        if(c == 13) return a + b;
        return a + b + c;
    }
}

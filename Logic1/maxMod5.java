package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:04 PM
 */
public class maxMod5 {
    public int maxMod5(int a, int b){
        if(a == b) return 0;
        if(a % 5 == b % 5) return Math.min(a,b);
        return Math.max(a,b);
    }
}

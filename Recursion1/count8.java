package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:43 PM
 */
public class count8 {
    public int count8(int n){
        if(n == 0) return 0;
        if(n%100 == 88) return 2 + count8(n/10);
        return ((n%10 == 8)?1:0) + count8(n/10);
    }
}

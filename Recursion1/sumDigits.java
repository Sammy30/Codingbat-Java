package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:39 PM
 */
public class sumDigits {
    public int sumDigits(int n){
        if(n == 0) return 0;
        return n%10 + sumDigits(n/10);
    }
}

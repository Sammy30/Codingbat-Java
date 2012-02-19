package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:46 PM
 */
public class powerIn {
    public int powerN(int base, int n){
        if(n == 0) return 1;
        if(n == 1) return base;
        return base* + powerN(base, n-1);
    }
}

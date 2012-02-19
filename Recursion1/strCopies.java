package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/18/12
 * Time: 1:34 AM
 */
public class strCopies {
    public boolean strCopies(String str, String sub, int n){
        if(str.length() < sub.length()) return n==0;
        if(str.substring(0,sub.length()).equals(sub)) return strCopies(str.substring(1),sub,n-1);
        return strCopies(str.substring(1),sub,n);
    }
}

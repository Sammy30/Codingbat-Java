package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 4:43 AM
 */
public class missingChar {
    public String missingChar(String str, int n) {
        return str.substring(0,n).concat(str.substring(n+1, str.length()));
    }
}

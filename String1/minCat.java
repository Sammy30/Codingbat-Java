package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:21 AM
 */
public class minCat {
    public String minCat(String a, String b){
        if(a.length() == b.length()) return a + b;
        int len = Math.min(a.length(), b.length());
        return a.substring(a.length() - len) + b.substring(b.length() - len);
    }
}

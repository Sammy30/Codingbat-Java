package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 2:48 AM
 */
public class nTwice {
    public String nTwice(String str, int n){
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}

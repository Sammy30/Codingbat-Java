package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 2:31 AM
 */
public class comboString {
    public String comboString(String a, String b){
        if(a.length() > b.length()) return b + a + b;
        return a + b + a;
    }
}

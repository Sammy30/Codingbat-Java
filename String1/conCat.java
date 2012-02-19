package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:09 AM
 */
public class conCat {
    public String conCat(String a, String b){
        if(a.length() == 0 || b.length() == 0) return a + b;
        if(a.charAt(a.length()-1) == b.charAt(0)) return a + b.substring(1);
        return a + b;
    }
}

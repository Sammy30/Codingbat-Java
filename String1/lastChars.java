package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:07 AM
 */
public class lastChars {
    public String lastChars(String a, String b){
        if(a.length() == 0) a += "@";
        if(b.length() == 0) b += "@";
        return a.substring(0,1) + b.substring(b.length()-1);
    }
}

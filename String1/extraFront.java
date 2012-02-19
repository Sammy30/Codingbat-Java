package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:25 AM
 */
public class extraFront {
    public String extraFront(String str){
        if(str.length() < 2) return str + str + str;
        String d = str.substring(0,2);
        return d + d + d;
    }
}

package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 2:28 AM
 */
public class firstTwo {
    public String firstTwo(String str){
        if(str.length() < 2) return str;
        return str.substring(0,2);
    }
}

package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 2:36 AM
 */
public class theEnd {
    public String theEnd(String str, boolean front){
        return (front) ? str.substring(0,1) : str.substring(str.length()-1);
    }
}

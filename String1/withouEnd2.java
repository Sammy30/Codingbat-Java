package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 2:42 AM
 */
public class withouEnd2 {
    public String withouEnd2(String str){
        return (str.length() < 3) ? "" : str.substring(1,str.length()-1);
    }
}

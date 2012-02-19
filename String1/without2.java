package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:27 AM
 */
public class without2 {
    public String without2(String str){
        if(str.length() == 2 || str.length() == 0) return "";
        if(str.length() == 1) return str;
        if(str.substring(0,2).equals(str.substring(str.length()-2))) return str.substring(2);
        return str;
    }
}

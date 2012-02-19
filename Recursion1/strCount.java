package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/18/12
 * Time: 1:30 AM
 */
public class strCount {
    public int strCount(String str, String sub){
        if(str.length() < sub.length()) return 0;
        if(str.substring(0,sub.length()).equals(sub)) return 1 + strCount(str.substring(sub.length()), sub);
        return strCount(str.substring(1),sub);
    }
}

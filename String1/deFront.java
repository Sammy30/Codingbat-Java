package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:30 AM
 */
public class deFront {
    public String deFront(String str){
        if(str.length() == 0) return str;
        if(str.length() >= 2){
            if(str.charAt(0) == 'a' && str.charAt(1) == 'b') return str;
            if(str.charAt(0) == 'a') return "a" + str.substring(2);
            if(str.charAt(1) == 'b') return str.substring(1);
            return str.substring(2);
        }
        if(str.length() == 1 && str.charAt(0) == 'a') return str;
        return "";
    }
}

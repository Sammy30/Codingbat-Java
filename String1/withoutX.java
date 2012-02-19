package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:57 AM
 */
public class withoutX {
    public String withoutX(String str){
        if(str.length() < 1) return str;
        if(str.charAt(0) == 'x') str = str.substring(1);
        if(str.length() < 1) return str;
        if(str.charAt(str.length()-1) == 'x') str = str.substring(0, str.length()-1);
        return str;
    }
}

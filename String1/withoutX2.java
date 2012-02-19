package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:01 AM
 */
public class withoutX2 {
    public String withoutX2(String str){
        if(str.length() < 1) return str;
        if(str.length() == 1 && str.charAt(0) == 'x') return "";
        if(str.charAt(1) == 'x') str = str.charAt(0) + str.substring(2);
        if(str.length() < 1) return str;
        if(str.charAt(0) == 'x') str = str.substring(1);
        return str;
    }
}

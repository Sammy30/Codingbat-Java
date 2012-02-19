package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:13 AM
 */
public class lastTwo {
    public String lastTwo(String str){
        if(str.length() < 2) return str;
        return str.substring(0, str.length()-2)
                + str.charAt(str.length() - 1) + str.charAt(str.length() -2);
    }
}

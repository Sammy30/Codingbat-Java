package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:04 AM
 */
public class atFirst {
    public String atFirst(String str){
        while(str.length() < 2){
            str += "@";
        }
        return str.substring(0,2);
    }
}

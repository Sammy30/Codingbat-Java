package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:19 AM
 */
public class frontAgain {
    public boolean frontAgain(String str){
        return str.length() >= 2 && (str.substring(0, 2).equals(str.substring(str.length() - 2)));
    }
}

package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 2:26 AM
 */
public class extraEnd {
    public String extraEnd(String str){
        String last2 = str.substring(str.length()-2);
        return last2 + last2 + last2;
    }
}

package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 12:37 AM
 */
public class repeatFront {
    public String repeatFront(String str, int n){
        String result = "";
        
        for(int count = n; count > 0; count--){
            result += str.substring(0, count);
        }
        return result;
    }
}

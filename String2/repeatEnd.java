package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 12:34 AM
 */
public class repeatEnd {
    public String repeatEnd(String str, int n){
        String result = "";

        for(int count = 0; count < n; count++){
            result += str.substring(str.length() - n);
        }
        return result;
    }
}

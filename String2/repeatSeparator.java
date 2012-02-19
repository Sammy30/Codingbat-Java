package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 12:42 AM
 */
public class repeatSeparator {
    public String repeatSeparator(String word, String sep, int count){
        String result = "";
        
        for(int counter = 0; counter < count; counter++){
            result+=word;
            if(counter != count -1) result +=sep;
        }
        return result;
    }
}

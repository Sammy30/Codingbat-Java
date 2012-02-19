package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 12:32 AM
 */
public class mixString {
    public String mixString(String a, String b){
        String result = "";
        
        for(int count = 0; count < Math.max(a.length(),b.length()); count++){
            if(count < a.length()) result += a.substring(count, count+1);
            if(count < b.length()) result += b.substring(count, count+1);
        }
        return result;
    }
}

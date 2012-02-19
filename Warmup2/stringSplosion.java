package Warmup2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/5/12
 * Time: 3:00 AM
 */
public class stringSplosion {
    public String stringSplosion(String str){
        String result ="";
        for(int counter = 0; counter <= str.length(); counter++){
            result += str.substring(0,counter);
        }
        return result;
    }
}

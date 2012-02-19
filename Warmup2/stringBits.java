package Warmup2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/5/12
 * Time: 5:06 AM
 */
public class stringBits {
    public String stringBits(String str){
        String result = "";
        for(int counter = 0; counter < str.length(); counter+=2){
            result += str.charAt(counter);
        }
        return result;
    }
}

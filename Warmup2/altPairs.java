package Warmup2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/5/12
 * Time: 4:27 AM
 */
public class altPairs {
    public String altPairs(String str){
        String result = "";
        for(int counter = 0; counter < str.length(); counter += 4){
            result += str.charAt(counter);
            if(counter < str.length()-1) result += str.charAt(counter+1);
        }
        return result;
    }
}

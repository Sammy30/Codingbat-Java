package Warmup2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/5/12
 * Time: 3:40 AM
 */
public class stringMatch {
    public int stringMatch(String a, String b){
        int result = 0;
        for(int counter = 0; counter < Math.min(a.length()-1, b.length()-1); counter++){
            if(a.substring(counter,counter+2).equals(b.substring(counter,counter+2))) result++;
        }
        return result;
    }
}

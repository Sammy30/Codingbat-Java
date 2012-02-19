package Warmup2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/5/12
 * Time: 5:02 AM
 */
public class frontTimes {
    public String frontTimes(String str, int n){
        String firstThree = (str.length() < 3) ? str : str.substring(0,3);
        String result = "";
        for(int counter = 0; counter < n; counter++){
            result += firstThree;
        }
        return result;
    }
}

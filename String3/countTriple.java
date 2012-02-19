package String3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 4:15 AM
 */
public class countTriple {
    public int countTriple(String str){
        int result = 0;
        for(int count = 0; count < str.length()-2; count++){
            if(str.charAt(count) == str.charAt(count+1)
                    && str.charAt(count) == str.charAt(count+2)) result++;
        }
        return result;
    }
}

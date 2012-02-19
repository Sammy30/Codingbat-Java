package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:54 AM
 */
public class wordsFront {
    public String[] wordsFront(String[] words, int n){
        String[] result = new String[n];
        for(int count = 0; count < n; count++){
            result[count] = words[count];
        }
        return result;
    }
}

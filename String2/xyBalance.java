package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 12:28 AM
 */
public class xyBalance {
    public boolean xyBalance(String str){
        boolean x = false;
        
        for(int count = 0; count < str.length(); count++){
            if(str.charAt(count) == 'y' && x) x = false;
            if(str.charAt(count) == 'x') x = true;
        }
        return !x;
    }
}

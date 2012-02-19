package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 12:44 AM
 */
public class prefixAgain {
    public boolean prefixAgain(String str, int n){
        String prefix = str.substring(0,n);
        
        for(int count = 1; count <= str.length() -n; count++){
            if(prefix.equals(str.substring(count, count + n))) return true;
        }
        return false;
    }
}

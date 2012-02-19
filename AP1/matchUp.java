package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:32 AM
 */
public class matchUp {
    public int matchUp(String[] a, String[] b){
        int result = 0;
        for(int count = 0; count < a.length; count++){
            if(a[count].length() >= 1 && b[count].length() >= 1
                    && a[count].substring(0,1).equals(b[count].substring(0,1))) result++;
        }
        return result;
    }
}

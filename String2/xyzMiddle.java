package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 12:49 AM
 */
public class xyzMiddle {
    public boolean xyzMiddle(String str){
        if(str.length() < 3) return false;
        
        int count;
        boolean isEven = false;
        if(str.length()%2 ==0){
            count = str.length()/2 -2;
            isEven = true;
        }else count = str.length()/2 -1;
        
        return str.substring(count, count +3).equals("xyz")
                || (isEven && str.substring(count+1, count+4).equals("xyz"));
    }
}

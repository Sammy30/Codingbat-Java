package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 12:06 AM
 */
public class xyzThere {
    public boolean xyzThere(String str){
        for(int count = 0; count < str.length()-2; count++){
            if(str.substring(count,count+3).equals("xyz")){
                if(count > 0 && str.substring(count-1, count).equals(".")) continue;
                return true;
            }
        }
        return false;
    }
}

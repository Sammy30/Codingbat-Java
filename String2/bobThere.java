package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 12:26 AM
 */
public class bobThere {
    public boolean bobThere(String str){
        for(int count = 0; count < str.length()-2; count++){
            if(str.substring(count, count+1).equals("b")
                    && str.substring(count+2, count+3).equals("b")) return true;
        }
        return false;
    }
}

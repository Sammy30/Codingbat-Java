package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 2:56 AM
 */
public class hasBad {
    public boolean hasBad(String str){
        return (str.length() >= 3 && str.substring(0,3).equals("bad") || str.length() >=4 && str.subSequence(1,4).equals("bad"));
    }
}

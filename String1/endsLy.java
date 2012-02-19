package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 2:45 AM
 */
public class endsLy {
    public boolean endsLy(String str){
        return (str.length() > 1 && str.substring(str.length()-2).equals("ly"));
    }
}

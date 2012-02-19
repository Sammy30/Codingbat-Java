package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:16 AM
 */
public class seeColor {
    public String seeColor(String str){
        if(str.length() < 3) return "";
        if(str.substring(0,3).equals("red")) return "red";
        if(str.length() < 4) return "";
        if(str.substring(0,4).equals("blue")) return "blue";
        return "";
    }
}

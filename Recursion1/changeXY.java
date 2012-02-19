package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:55 PM
 */
public class changeXY {
    public String changeXY(String str){
        if(str.length() == 0) return "";
        if(str.substring(0,1).equals("x")) return "y" + changeXY(str.substring(1));
        return str.substring(0,1) + changeXY(str.substring(1));
    }
}

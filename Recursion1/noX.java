package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:02 PM
 */
public class noX {
    public String noX(String str){
        if(str.length() == 0) return "";
        if(str.substring(0,1).equals("x")) return noX(str.substring(1));
        return str.substring(0,1) + noX(str.substring(1));
    }
}

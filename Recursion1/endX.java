package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:19 PM
 */
public class endX {
    public String endX(String str){
        if(str.length() < 1) return str;
        if(str.substring(0,1).equals("x")) return endX(str.substring(1)) + "x";
        return str.substring(0,1) + endX(str.substring(1));
    }
}

package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:12 PM
 */
public class allStar {
    public String allStar(String str){
        if(str.length() < 2) return str;
        return str.substring(0,1) + "*" + allStar(str.substring(1));
    }
}

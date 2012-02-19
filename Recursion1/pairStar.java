package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:15 PM
 */
public class pairStar {
    public String pairStar(String str){
        if(str.length() < 2) return str;
        if(str.substring(0,1).equals(str.substring(1,2))){
            return str.substring(0,1) + "*" + pairStar(str.substring(1));
        }
        return str.substring(0,1) + pairStar(str.substring(1));
    }
}

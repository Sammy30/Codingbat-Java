package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:25 PM
 */
public class stringClean {
    public String stringClean(String str){
        if(str.length()<2) return str;
        if(str.substring(0,1).equals(str.substring(1,2))){
            return stringClean(str.substring(1));
        }
        return str.substring(0,1) + stringClean(str.substring(1));
    }
}

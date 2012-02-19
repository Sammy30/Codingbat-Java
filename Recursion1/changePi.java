package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:59 PM
 */
public class changePi {
    public String changePi(String str){
        if(str.length() < 2) return str;
        if(str.substring(0,2).equals("pi")) return "3.14" + changePi(str.substring(2));
        return str.substring(0,1) + changePi(str.substring(1));
    }
}

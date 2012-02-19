package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/18/12
 * Time: 1:04 AM
 */
public class parenBit {
    public String parenBit(String str){
        if(str.substring(0,1).equals("(") && str.substring(str.length()-1).equals(")")) return str;
        if(str.substring(0,1).equals("(")) return parenBit(str.substring(0,str.length()-1));
        return parenBit(str.substring(1));
    }
}

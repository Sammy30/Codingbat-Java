package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/18/12
 * Time: 1:20 AM
 */
public class nestParen {
    public boolean nestParen(String str){
        if(str.length() == 0) return true;
        if(str.substring(0,1).equals("(") 
                && str.substring(str.length()-1,str.length()).equals(")")){
            return nestParen(str.substring(1, str.length()-1));
        }
        if(str.length() == 1 && (str.equals("(") || str.equals(")"))) return false;
        if(str.substring(0,1).equals("(")) return nestParen(str.substring(0,str.length()-1));
        return (str.substring(0, 1).equals("(") || str.substring(0, 1).equals(")")) && nestParen(str.substring(1));
    }
}

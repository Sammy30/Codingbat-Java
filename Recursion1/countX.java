package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:50 PM
 */
public class countX {
    public int countX(String str){
        if(str.length() == 0) return 0;
        return ((str.substring(0,1).equals("x"))?1:0) + countX(str.substring(1));
    }
}

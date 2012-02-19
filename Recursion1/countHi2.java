package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:28 PM
 */
public class countHi2 {
    public int countHi2(String str){
        if(str.length() < 2) return 0;
        if(str.length() >= 3 && str.substring(0,3).equals("xhi")) return countHi2(str.substring(3));
        if(str.substring(0,2).equals("hi")) return 1 + countHi2(str.substring(2));
        return countHi2(str.substring(1));
    }
}

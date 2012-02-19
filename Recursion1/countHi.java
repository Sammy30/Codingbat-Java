package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:54 PM
 */
public class countHi {
    public int countHi(String str){
        if(str.length() < 2) return 0;
        return ((str.substring(0,2).equals("hi"))?1:0) + countHi(str.substring(1));
    }
}

package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:20 PM
 */
public class countPairs {
    public int countPairs(String str){
        if(str.length()<3) return 0;
        if(str.substring(0,1).equals(str.substring(2,3))) return 1 + countPairs(str.substring(1));
        return countPairs(str.substring(1));
    }
}

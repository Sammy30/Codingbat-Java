package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:22 PM
 */
public class countAbc {
    public int countAbc(String str){
        if(str.length() < 3) return 0;
        if(str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba")){
            return 1 + countAbc(str.substring(1));
        }
        return countAbc(str.substring(1));
    }
}

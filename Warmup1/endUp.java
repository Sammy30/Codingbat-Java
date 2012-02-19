package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 6:39 AM
 */
public class endUp {
    public String endUp(String str) {
        if(str.length() < 4) return str.toUpperCase();
        return str.substring(0,str.length()-3) + str.substring(str.length()-3, str.length()).toUpperCase();
    }
}

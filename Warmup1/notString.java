package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 4:38 AM
 */
public class notString {
    public String notString(String str) {
        if(str.length() >= 3 && str.substring(0,3).equals("not")) return str;
        return "not ".concat(str);
    }
}

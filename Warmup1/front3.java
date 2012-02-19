package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 5:02 AM
 */
public class front3 {
    public String front3(String str) {
        if(str.length() <= 3) return str.concat(str).concat(str);
        String fb = str.substring(0,3);
        return fb+fb+fb;
    }

}

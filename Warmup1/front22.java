package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 5:13 AM
 */
public class front22 {
    public String front22(String str) {
        if(str.length() <=2) return str + str + str;
        return str.substring(0,2) + str + str.substring(0,2);
    }

}

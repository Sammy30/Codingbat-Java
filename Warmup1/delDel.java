package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 5:28 AM
 */
public class delDel {
    public String delDel(String str) {
        if(!(str.length() < 4) && str.substring(1,4).equals("del")){
            return str.substring(0,1) + str.substring(4, str.length());
        }
        return str;
    }

}

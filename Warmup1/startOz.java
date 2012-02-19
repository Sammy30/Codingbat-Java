package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 5:54 AM
 */
public class startOz {
    public String startOz(String str) {
        String newstr = "";
        if(str.startsWith("o")) newstr += "o";
        if(str.startsWith("z",1)) newstr += "z";
        return newstr;
    }

}

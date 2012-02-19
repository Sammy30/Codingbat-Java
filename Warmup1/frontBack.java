package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 4:45 AM
 */
public class frontBack {
    public String frontBack(String str) {
        if(str.equals("")) return "";
        char fb[] = str.toCharArray();
        char c = fb[fb.length-1];
        fb[fb.length-1] = fb[0];
        fb[0] = c;
        return new String(fb);
    }
}

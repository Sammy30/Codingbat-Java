package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 5:39 AM
 */
public class mixStart{
    public boolean mixStart(String str) {
        return !(str.length() < 3) && str.substring(1,3).equals("ix");
    }
}

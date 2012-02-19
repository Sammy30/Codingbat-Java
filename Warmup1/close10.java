package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 6:03 AM
 */
public class close10 {
    public int close10(int a, int b) {
        if(Math.abs(10-a) == Math.abs(10-b)) return 0;
        if(Math.abs(10-a) < Math.abs(10-b)) return a;
        return b;
    }
}

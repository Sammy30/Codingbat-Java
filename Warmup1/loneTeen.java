package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 5:23 AM
 */
public class loneTeen {
    public boolean loneTeen(int a, int b) {
        return a > 12 && a < 20 && !(b > 12 && b < 20) || b > 12 && b < 20 && !(a>12 && a < 20);
    }
}

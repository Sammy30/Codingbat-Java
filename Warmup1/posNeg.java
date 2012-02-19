package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 4:27 AM
 */
public class posNeg{
    public boolean posNeg(int a, int b, boolean negative) {
        return a * b < 0 && !negative || a < 0 && b < 0 && negative;
    }
}

package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 6:22 AM
 */
public class max1020 {
    public int max1020(int a, int b) {
        boolean valida = a > 9 && a < 21;
        boolean validb = b > 9 && b < 21;
        if(!(valida || validb)) return 0;
        if(Math.max(a,b) == a && valida){
            return a;
        }else if(!valida){
            return b;
        }

        if(Math.max(a,b) == b && validb){
            return b;
        }

        return a;
    }
}

package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:59 AM
 */
public class scoresSpecial {
    public int scoresSpecial(int[] a, int[] b){
        int bigA = 0;
        int bigB = 0;
        for(int count = 0; count < Math.max(a.length,b.length); count++){
            if(count < a.length && a[count]%10 == 0)  bigA = Math.max(bigA, a[count]);
            if(count < b.length && b[count]%10 == 0) bigB = Math.max(bigB, b[count]);
        }
        return bigA + bigB;
    }
}

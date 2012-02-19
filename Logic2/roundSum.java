package Logic2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:07 PM
 */
public class roundSum {
    public int roundSum(int a, int b, int c){
        return round10(a) + round10(b) + round10(c);
    }
    
    public int round10(int num){
        if(num % 10 >= 5) return ((num / 10) + 1) * 10;
        return num - (num % 5);
    }
}

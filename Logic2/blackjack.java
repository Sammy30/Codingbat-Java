package Logic2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 5:20 PM
 */
public class blackjack {
    public int blackjack(int a, int b){
        if(Math.max(a,b) < 22) return Math.max(a,b);
        if(Math.min(a,b) < 22) return Math.min(a,b);
        return 0;
    }
}

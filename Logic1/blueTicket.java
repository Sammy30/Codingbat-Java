package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:13 PM
 */
public class blueTicket {
    public int blueTicket(int a, int b, int c){
        if(a + b == 10 || a + c == 10 || b + c == 10) return 10;
        if( a + b >= a + c + 10 || a + b >= b + c + 10) return 5;
        return 0;
    }
}

package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:09 PM
 */
public class greenTicket {
    public int greenTicket(int a, int b, int c){
        if(a != b && a != c && b != c) return 0;
        if(a == b && a == c) return 20;
        return 10;
    }
}

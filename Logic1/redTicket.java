package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:06 PM
 */
public class redTicket {
    public int redTicket(int a, int b, int c){
        if(a == 2 && b == 2 && c == 2) return 10;
        if(a == b && a == c) return 5;
        if(a != b && a != c) return 1;
        return 0;
    }
}

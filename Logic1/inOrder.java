package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:45 AM
 */
public class inOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk){
        return (bOk && c > b || b > a && c > b);
    }
}

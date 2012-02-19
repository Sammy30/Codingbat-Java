package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:43 AM
 */
public class twoAsOne {
    public boolean twoAsOne(int a, int b, int c){
        return a + b == c || a + c == b || b + c == a;
    }
}

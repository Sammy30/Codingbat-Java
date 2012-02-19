package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:52 AM
 */
public class inOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk){
        return (equalOk && a <= b && b <= c) || a < b && b < c;
    }
}

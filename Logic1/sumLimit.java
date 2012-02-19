package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:19 PM
 */
public class sumLimit {
    public int sumLimit(int a, int b){
        if(Integer.toString(a + b).length() == Integer.toString(a).length()) return a + b;
        if(Integer.toString(a + b).length() > Integer.toString(a).length()) return a;
        return 0;
    }
}

package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:24 AM
 */
public class in1To10 {
    public boolean in1To10(int n, boolean outsideMode){
        return (outsideMode && (n <= 1 || n >= 10) || (!outsideMode && n >= 1 && n <= 10));
    }
}

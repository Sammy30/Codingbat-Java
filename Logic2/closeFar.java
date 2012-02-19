package Logic2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 4:21 PM
 */
public class closeFar {
    public boolean closeFar(int a, int b, int c){
        return (Math.abs(a - b) <= 2) && (Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2)
                || (Math.abs(a - c) <= 2) && (Math.abs(a - b) >= 2 && Math.abs(c - b) >= 2)
                || (Math.abs(b - c) <= 2) && (Math.abs(b - a) >= 2 && Math.abs(c - a) >= 2);
    }
}

package Logic2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:26 PM
 */
public class makeBricks {
    public boolean makeBricks(int small, int big, int goal){
        return goal % 5 <= small && (big * 5 + small >= goal);
    }
}

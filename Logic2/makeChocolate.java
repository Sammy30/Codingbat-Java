package Logic2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:06 PM
 */
public class makeChocolate {
    public int makeChocolate(int small, int big, int goal){
        if(goal >= 5){
            if(goal/5 >= big){
                goal-= big * 5;
            }else{
                goal = goal % 5;
            }
        }
        if(goal <= small) return goal;
        return -1;
    }
}

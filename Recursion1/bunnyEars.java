package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:28 PM
 */
public class bunnyEars {
    public int bunnyEars(int bunnies){
        if(bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies-1);
    }
}

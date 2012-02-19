package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:36 PM
 */
public class bunnyEars2 {
    public int bunnyEars2(int bunnies){
        if(bunnies == 0) return 0;
        if(bunnies%2 == 0) return 3 + bunnyEars2(bunnies-1);
        return 2+ bunnyEars2(bunnies-1);
    }
}

package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:05 AM
 */
public class cigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend){
        return isWeekend && cigars >= 40 || cigars >= 40 && cigars <= 60;
    }
}

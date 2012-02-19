package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:12 AM
 */
public class squirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer){
        return isSummer && temp <= 100 && temp >= 60 || temp <= 90 && temp >= 60;
    }
}

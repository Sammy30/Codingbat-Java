package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:16 AM
 */
public class caughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday){
        if(isBirthday){
            if(speed <= 65) return 0;
            if(speed <= 85) return 1;
            return 2;
        }
        if(speed <= 60) return 0;
        if(speed <= 80) return 1;
        return 2;
    }
}

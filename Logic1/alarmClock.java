package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:21 AM
 */
public class alarmClock {
    public String alarmClock(int day, boolean vacation){
        if(vacation){
            if(day > 0 && day < 6) return "10:00";
            return "off";
        }
        if(day > 0 && day < 6) return "7:00";
        return "10:00";
    }
}

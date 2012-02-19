package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:00 AM
 */
public class hasOne {
    public boolean hasOne(int n){
        do{
            if(n%10 == 1) return true;
            n/=10;
        }while(n > 0);
        return false;
    }
}

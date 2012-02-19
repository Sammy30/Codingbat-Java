package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:11 AM
 */
public class dividesSelf {
    public boolean dividesSelf(int n){
        int temp = n;
        do{
            if(temp%10 == 0 || n%(temp%10) != 0) return false;
            temp/=10;
        }while(temp != 0);
        return true;
    }
}

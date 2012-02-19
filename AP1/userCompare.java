package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 6:11 AM
 */
public class userCompare {
    public int userCompare(String aName, int aId, String bName, int bId){
        if(aName.compareTo(bName) > 0) return 1;
        if(aName.equals(bName)){
            if(aId == bId) return 0;
            if(aId > bId) return 1;
        }
        return -1;
    }
}

package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:40 AM
 */
public class teaParty {
    public int teaParty(int tea, int candy){
        if(tea < 5 || candy < 5) return 0;
        if(tea >= candy *2 || candy >= tea *2) return 2;
        return 1;
    }
}

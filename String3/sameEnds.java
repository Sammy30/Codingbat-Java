package String3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 4:19 AM
 */
public class sameEnds {
    public String sameEnds(String string){
        String matches = "";
        for(int count = 1; count < string.length()/2+1; count++){
            if(string.substring(0,count).equals(string.substring(string.length()-count))){
                matches = string.substring(0,count);
            }
        }
        return matches;
    }
}

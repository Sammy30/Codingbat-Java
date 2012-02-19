package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 1:24 AM
 */
public class sameStarChar {
    public boolean sameStarChar(String str){
        for(int count = 0; count < str.length(); count++){
            if(str.substring(count, count+1).equals("*")){
                if(count == 0 || count == str.length()-1) continue;
                if(!str.substring(count - 1, count).equals(str.substring(count + 1, count + 2))) return false;
            }
        }
        return true;
    }
}

package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 11:35 PM
 */
public class doubleChar {
    public String doubleChar(String str){
        String result = "";
        for(int count = 0; count < str.length(); count++){
            result += str.substring(count,count+1) + str.substring(count,count+1);
        }
        return result;
    }
}

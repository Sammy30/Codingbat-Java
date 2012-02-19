package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 1:43 AM
 */
public class starOut {
    public String starOut(String str){
        String result = "";
        for(int count = 0; count < str.length(); count++){
            if(count != 0 && str.substring(count-1, count).equals("*")) continue;
            if(str.substring(count, count+1).equals("*")) continue;
            if(count != str.length() -1
                    && str.substring(count+1, count+2).equals("*")) continue;
            result+=str.substring(count,count+1);
        }
        return result;
    }
}

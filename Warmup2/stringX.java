package Warmup2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/5/12
 * Time: 4:20 AM
 */
public class stringX {
    public String stringX(String str){
        for(int counter = str.length()-2; counter >0; counter--){
            if(str.charAt(counter) == 'x') str = str.substring(0, counter) + str.substring(counter+1);
        }
        return str;
    }
}

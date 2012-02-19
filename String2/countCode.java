package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 11:44 PM
 */
public class countCode {
    public int countCode(String str){
        int result = 0;
        
        for(int count = 0; count < str.length() -3; count++){
            if(str.substring(count,count+2).equals("co")
                    && str.substring(count+3, count+4).equals("e")) result++;
        }
        return result;
    }
}

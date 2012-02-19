package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 11:38 PM
 */
public class countHi {
    public int countHi(String str){
        if(str.length() < 2) return 0;

        int result = 0;
        for(int count = 0; count < str.length() -1; count++){
            if(str.substring(count, count+2).equals("hi")) result++;
        }
        return result;
    }
}

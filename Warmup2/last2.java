package Warmup2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/5/12
 * Time: 3:03 AM
 */
public class last2 {
    public int last2(String str){
        if(str.length() < 3) return 0;
        
        int result = 0;
        String last2 = str.substring(str.length()-2);
        for(int counter = str.length()-3; counter >=0; counter--){
            if(last2.equals(str.substring(counter, counter + 2))) result++;
        }
        return result;
    }
}

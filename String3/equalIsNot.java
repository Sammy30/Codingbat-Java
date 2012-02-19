package String3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 3:59 AM
 */
public class equalIsNot {
    public boolean equalIsNot(String str){
        if(str.length() < 2) return true;
        int timesIs = 0;
        int timesNot = 0;
        for(int count = 0; count < str.length()-2; count++){
            if(str.substring(count, count+3).equals("not")) timesNot++;
            else if(str.substring(count, count+2).equals("is")) timesIs++;
        }
        if(str.substring(str.length()-2).equals("is")) timesIs++;
        return timesIs == timesNot;
    }
}

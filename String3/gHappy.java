package String3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 4:03 AM
 */
public class gHappy {
    public boolean gHappy(String str){
        if(str.length() < 1) return true;
        if(str.length() == 1 && str.substring(0,1).equals("g")) return false;
        if(str.length() == 1) return true;
        if(str.substring(0,1).equals("g")
                && !str.substring(1,2).equals("g")) return false;
        if(str.substring(str.length()-1).equals("g")
                && !str.substring(str.length()-2,str.length()-1).equals("g")) return false;
        for(int count = 1; count < str.length()-1; count++){
            if(str.substring(count, count+1).equals("g")
                    && !str.substring(count-1,count).equals("g")
                    && !str.substring(count+1,count+2).equals("g")) return false;
        }
        return true;
    }
}


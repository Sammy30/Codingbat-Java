package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 1:38 AM
 */
public class zipZap {
    public String zipZap(String str){
        if(str.length() < 3) return str;

        for(int count = 0; count < str.length() -2; count++){
            if(str.substring(count, count+1).equals("z")
                    && str.substring(count+2, count+3).equals("p")){
                str = str.substring(0,count+1) + str.substring(count+2);
            }
        }

        return str;
    }
}

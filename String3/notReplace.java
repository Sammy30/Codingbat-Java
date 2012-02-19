package String3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 5:17 AM
 */
public class notReplace {
    public String notReplace(String str){
        if(str.length() < 2) return str;
        for(int count = 2; count < str.length()-3; count++){
            if(!Character.isLetter(str.charAt(count))
                    && str.substring(count+1, count+3).equals("is")
                    && !Character.isLetter(str.charAt(count+3))){
                str = str.substring(0, count) + " is not"+ str.substring(count+3);
                count+=6;
            }
        }
        if(str.length() == 2){
            if(str.substring(0,2).equals("is")) return "is not";
            else return str;
        }
        if(str.substring(0,2).equals("is")
                && !Character.isLetter(str.charAt(2))) str = "is not" + str.substring(2);
        if(!Character.isLetter(str.charAt(str.length()-3))
                && str.substring(str.length()-2).equals("is")) str+=" not";
        return str;
    }
}

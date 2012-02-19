package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 2:35 AM
 */
public class plusOut {
    public String plusOut(String str, String word){
        String result = "";
        for(int count = 0; count < str.length(); count++){
            if(count + word.length() <= str.length()
                    && str.substring(count,count+word.length()).equals(word)){
                result+=word;
                count+=word.length()-1;
            }else{
                result+="+";
            }
            
        }
        return result;
    }
}

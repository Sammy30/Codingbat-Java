package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 2:42 AM
 */
public class wordEnds {
    public String wordEnds(String str, String word){
        if(word.length() >= str.length()) return "";
        String result = "";
        for(int count = -1; count < str.length()-word.length(); count++){
            if(str.substring(count+1, count+word.length()+1).equals(word)){
                if(count != -1) result+=str.substring(count,count+1);
                if(count + word.length() < str.length()-1) result += str.substring(count+1+word.length(), count+2+word.length());
            }
        }
        return result;
    }
}

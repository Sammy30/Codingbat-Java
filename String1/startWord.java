package String1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:41 AM
 */
public class startWord {
    public String startWord(String str, String word){
        if(str.length() < word.length() - 1 || str.length() < 1) return "";
        if(str.length() == 1 && word.length() == 2 && str.charAt(0) == word.charAt(1))
            return str;
        if(str.length() == 1 && word.length() == 1)
            return str;
        if(str.length() == 1) return "";
        if(str.substring(1, word.length()).equals(word.substring(1)))
            return str.substring(0, word.length());
        return "";
    }
}

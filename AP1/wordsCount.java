package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:53 AM
 */
public class wordsCount {
    public int wordsCount(String[] words, int len){
        int result = 0;
        for(String a : words){
            if(a.length() == len) result++;
        }
        return result;
    }
}

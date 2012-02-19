package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:51 AM
 */
public class wordsWithout {
    public String[] wordsWithout(String[] words, String target){
        int tally = 0;
        for(String a : words){
            if(!a.equals(target)) tally++;
        }
        String[] result = new String[tally];
        tally = 0;
        for(String a: words){
            if(!a.equals(target)){
                result[tally] = a;
                tally++;
                if(tally == result.length) break;
            }
        }
        return result;
    }
}

package AP1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:56 AM
 */
public class wordsWithoutList {
    public List wordsWithoutList(String[] words, int len){
        ArrayList<String> result = new ArrayList<String>();
        for(String a : words){
            if(a.length() != len) result.add(a);
        }
        return result;
    }
}

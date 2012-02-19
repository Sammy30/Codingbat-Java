package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 5:36 AM
 */
public class scoreUp {
    public int scoreUp(String[] key, String[] answers){
        int result = 0;
        for(int count = 0; count < key.length; count++){
            if(key[count].equals(answers[count])) result+=4;
            else if(answers[count].equals("?")) {}
            else result--;
        }
        return result;
    }
}

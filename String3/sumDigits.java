package String3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 4:17 AM
 */
public class sumDigits {
    public int sumDigits(String str){
        int sum = 0;
        for(char a : str.toCharArray()){
            if(Character.isDigit(a)) sum+= Integer.parseInt(a+"");
        }
        return sum;
    }
}

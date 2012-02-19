package String3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 3:32 AM
 */
public class countYZ {
    public int countYZ(String str){
        int result = 0;
        if(str.substring(str.length()-1,str.length()).equalsIgnoreCase("y")
                || str.substring(str.length()-1, str.length()).equalsIgnoreCase("z")) result++;

        for(int count = 1; count < str.length(); count++){
            if(!Character.isLetter(str.charAt(count))
                    && (str.substring(count-1,count).equalsIgnoreCase("y")
                    || str.substring(count-1,count).equalsIgnoreCase("z"))) result++;
        }
        return result;
    }
}

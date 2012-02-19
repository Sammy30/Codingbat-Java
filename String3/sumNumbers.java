package String3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 5:01 AM
 */
public class sumNumbers {
    public int sumNumbers(String str){
        int numLength = 0;
        int sum = 0;
        for(int count = 0; count < str.length(); count++){
            if(Character.isDigit(str.charAt(count))) numLength++;
            else{
                if(numLength > 0){
                    sum+= Integer.parseInt((str.substring(count-numLength, count)));
                    numLength = 0;
                }

            }
        }
        if(numLength > 0) sum+= Integer.parseInt(str.substring(str.length() - numLength));
        return sum;
    }
}

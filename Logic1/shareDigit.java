package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 3:16 PM
 */
public class shareDigit {
    public boolean shareDigit(int a, int b){
        return a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10;
    }
}

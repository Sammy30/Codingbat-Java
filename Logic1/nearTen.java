package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:29 AM
 */
public class nearTen {
    public boolean nearTen(int num){
        return num % 10 <= 2 || num % 10 >= 8;
    }
}

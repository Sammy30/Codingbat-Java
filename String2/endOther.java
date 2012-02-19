package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 11:48 PM
 */
public class endOther {
    public boolean endOther(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();

        for(int count = Math.abs(a.length() - b.length()); count >= 0 ; count--){
            if(count + b.length() == a.length()
                    && a.substring(count, count + b.length()).equals(b)) return true;
            if(count + a.length() == b.length()
                    && b.substring(count, count + a.length()).equals(a)) return true;
        }
        return false;
    }
}

package String3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 3:52 AM
 */
public class withoutString {
    public String withoutString(String base, String remove){
        for(int count = 0; count < base.length() +1 - remove.length(); count++){
            if(base.substring(count,count+remove.length()).equalsIgnoreCase(remove)){
                base = base.substring(0,count) + base.substring(count + remove.length());
                count--;
            }
        }
        return base;
    }
}

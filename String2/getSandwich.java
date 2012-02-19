package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 1:02 AM
 */
public class getSandwich {
    public String getSandwich(String str){
        if(str.length() < 11) return "";

        String result = "";
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");
        if(firstBread == lastBread) return "";
        for(int count = firstBread + 5; count < lastBread; count++){
            result += str.substring(count, count+1);
        }
        return result;
    }
}

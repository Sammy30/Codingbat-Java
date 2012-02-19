package String3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 4:26 AM
 */
public class mirrorEnds {
    public String mirrorEnds(String string){
        String matches = "";
        for(int count = 1; count < string.length()+1; count++){
            char[] reverse = string.substring(0,count).toCharArray();
            for(int coun2 = 0; coun2 < reverse.length/2; coun2++){
                char temp = reverse[coun2];
                reverse[coun2] = reverse[reverse.length-1-coun2];
                reverse[reverse.length-1-coun2] = temp;
            }
            if(new String(reverse).equals(string.substring(string.length()-count))){
                matches = string.substring(0,count);
            }
        }
        return matches;
    }
}

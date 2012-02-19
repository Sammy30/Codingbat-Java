package String1;

import javax.swing.text.html.MinimalHTMLWriter;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 2:49 AM
 */
public class twoChar {
    public String twoChar(String str, int index){
        if(index < 0) return str.substring(0,2);
        return (index + 2 > str.length()) ? str.substring(0,2) : str.substring(index, index+2);
    }
}

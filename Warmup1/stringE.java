package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 6:32 AM
 */
public class stringE{
    public boolean stringE(String str) {
        int count = 0;
        for(char a: str.toCharArray()){
            if(a == 'e') count++;
        }
        return count > 0 && count < 4;
    }
}

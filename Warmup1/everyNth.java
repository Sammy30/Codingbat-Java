package Warmup1;

/**
 * User: Matthew M Jenkins
 * Date: 1/20/12
 * Time: 6:46 AM
 */
public class everyNth {
    public String everyNth(String str, int n) {
        char[] zee = str.toCharArray();
        String result = "";
        for(int x = 0; x < zee.length; x+=n){
            result+=zee[x];
        }
        return result;
    }

}

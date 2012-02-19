package Logic2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 5:24 PM
 */
public class evenlySpaced {
    public boolean evenlySpaced(int a, int b, int c){
        int small = Math.min(Math.min(a,b),c);
        int large = Math.max(Math.max(a,b),c);
        int medium = 0;
        if(a == small){
            if(b == large) medium = c;
            if(c == large) medium = b;
        }
        if(b == small){
            if(a == large) medium = c;
            if(c == large) medium = a;
        }
        if(c == small){
            if(a == large) medium = b;
            if(b == large) medium = a;
        }
        

        return (large - medium == medium - small);
    }
}

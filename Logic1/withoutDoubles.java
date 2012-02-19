package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 2:57 PM
 */
public class withoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles){
        if(noDoubles && die1 == die2){
            if(die1 == 6) return 1 + die2;
            return die1 + die2 + 1;
        }
        return die1 + die2;
    }
}

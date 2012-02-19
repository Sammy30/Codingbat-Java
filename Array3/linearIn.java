package Array3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/16/12
 * Time: 4:31 AM
 */
public class linearIn {
    public boolean linearIn(int[] outer, int[] inner){
        int innerPeg = 0;
        for (int anOuter : outer) {
            for (int innerCount = innerPeg; innerCount < inner.length; innerCount++) {
                if (inner[innerCount] == anOuter) {
                    innerPeg++;
                    break;
                }
            }
        }
        return innerPeg == inner.length;
    }
}

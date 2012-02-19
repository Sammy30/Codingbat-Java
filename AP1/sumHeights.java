package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 6:04 AM
 */
public class sumHeights {
    public int sumHeights(int[] heights, int start, int end){
        int result = 0;
        for(int count = start; count < end; count++){
            result+=Math.abs(heights[count] - heights[count+1]);
        }
        return result;
    }
}

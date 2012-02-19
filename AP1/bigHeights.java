package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 6:09 AM
 */
public class bigHeights {
    public int bigHeights(int[] heights, int start, int end){
        int result = 0;
        for(int count = start; count < end; count++){
            if(Math.abs(heights[count]-heights[count+1]) >= 5) result++;
        }
        return result;
    }
}

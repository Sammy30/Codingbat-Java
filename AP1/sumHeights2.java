package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 6:06 AM
 */
public class sumHeights2 {
    public int sumHeights2(int[] heights, int start, int end){
        int result = 0;
        for(int count = start; count < end; count++){
            if(heights[count] < heights[count+1]) result+=2*(heights[count+1]-heights[count]);
            else result+= heights[count]-heights[count+1];
        }
        return result;
    }
}

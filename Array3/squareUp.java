package Array3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/16/12
 * Time: 5:02 AM
 */
public class squareUp {
    public int[] squareUp(int n){
        if(n == 1) return new int[] {1};
        int[] result = new int[n*n];

        for(int outCount = n*n-1; outCount >0; outCount--){
            for(int inCount = outCount; inCount >= n*(n*n-outCount-1); inCount -=n){
                result[inCount] = n*n - outCount;
            }
        }
        return result;
    }
}

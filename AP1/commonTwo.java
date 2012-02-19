package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 6:35 AM
 */
public class commonTwo {
    public int commonTwo(String[] a, String[] b){
        int bIndex = 0;
        int result = 0;

        for(int count = 0; count < a.length; count++){
            if(count != 0 && a[count-1].equals(a[count])) continue;
            if(bIndex >= b.length) break;
            for(int bCount = bIndex; bCount < b.length; bCount++){
                if(a[count].compareTo(b[bCount]) <= 0){
                    bIndex = bCount;
                    break;
                }
            }
            if(a[count].equals(b[bIndex])){
                result++;
                bIndex++;
            }
        }
        return result;
    }
}

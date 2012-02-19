package AP1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 6:20 AM
 */
public class mergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n){
        int aIndex = 0;
        int bIndex = 0;
        String[] result = new String[n];
        
        for(int count = 0; count < result.length; count++){
            if(count != 0){
                if(b[bIndex].equals(result[count-1])) bIndex++;
                if(a[aIndex].equals(result[count-1])) aIndex++;
            }
            if(a[aIndex].compareTo(b[bIndex]) > 0){
                result[count] = b[bIndex];
                bIndex++;
            }else{
                result[count] = a[aIndex];
                aIndex++;
            }
        }
        return result;
    }
}

package Array2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/10/12
 * Time: 4:00 AM
 */
public class has77 {
    public boolean has77(int[] nums){
        boolean[] was7 = {false,false};
        for(int a : nums){
            if(a == 7){
                if(was7[0] || was7[1]) return true;
                else{
                    was7[1] = was7[0];
                    was7[0] = true;
                }
            }else{
                was7[1] = was7[0];
                was7[0] = false;
            }
        }
        return false;
    }
}

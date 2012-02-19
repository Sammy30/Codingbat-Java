package Recursion1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/17/12
 * Time: 4:38 PM
 */
public class triangle {
    public int triangle(int rows){
        if(rows == 0) return 0;
        return rows + triangle(rows-1);
    }
}

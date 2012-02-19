package Logic1;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 6:09 AM
 */
public class dateFashion {
    public int dateFashion(int you, int date){
        if(you <= 2 || date <= 2) return 0;
        if(you >= 8 || date >= 8) return 2;
        return 1;
    }
}

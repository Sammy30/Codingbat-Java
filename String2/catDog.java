package String2;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/9/12
 * Time: 11:41 PM
 */
public class catDog {
    public boolean catDog(String str){
        int cat = 0;
        int dog = 0;

        for(int count = 0; count < str.length() -2; count++){
            if(str.substring(count,count+3).equals("cat")) cat++;
            if(str.substring(count,count+3).equals("dog")) dog++;
        }
        return cat == dog;
    }
}

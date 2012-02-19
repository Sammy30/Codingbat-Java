package String3;

/**
 * Created by IntelliJ IDEA.
 * User: Matthew M Jenkins
 * Date: 2/11/12
 * Time: 4:35 AM
 */
public class maxBlock {
    public int maxBlock(String str){
        if(str.length() == 0) return 0;
        int block = 1;
        char lastChar = str.charAt(0);
        int temp = 1;
        
        for(int count = 1; count < str.length(); count++){
            if(lastChar == str.charAt(count)){
                temp++;
            }else{
                temp = 1;
                lastChar = str.charAt(count);
            }
            block = Math.max(temp, block);
        }
        return block;
    }
}

/**
 * @author yann
 *
 */
public class HelloWorld {
  
    public static void main(String[] args) {
  
        long l = 50;
        int i = 50;
         
        //int比较小，要放进比较大的long,随便怎么样，都放的进去
        l = i;
        System.out.println(i);
          
    }
}
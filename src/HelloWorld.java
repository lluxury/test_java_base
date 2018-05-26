import java.util.Arrays;
  
/**
 * @author yann
 *
 */
public class HelloWorld {
    public static void main(String[] args) {
        int a[] = new int[10];
  
        Arrays.fill(a, 5);
  
        System.out.println(Arrays.toString(a));
  
    }
}
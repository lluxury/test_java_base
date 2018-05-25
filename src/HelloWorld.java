public class HelloWorld {
    public static void main(String[] args) {
 
        int i = 5;
        int j = 6;
 
        int k = i < j ? 99 : 88;
 
        // 相当于
        if (i < j) {
            k = 99;
        } else {
            k = 88;
        }
 
        System.out.println(k);
 
    }
}
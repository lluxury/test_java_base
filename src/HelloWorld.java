public class HelloWorld {
    public static void main(String[] args) {
        byte i  =5;
         
        System.out.println(Integer.toBinaryString(i)); //5的二进制是00000101,所以取非即为11111010,即为-6
         
        System.out.println(~i);
         
    }
     
}
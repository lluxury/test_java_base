public class HelloWorld {
    public static void main(String[] args) {
        int i  =5;
        int j = 6;
        System.out.println(Integer.toBinaryString(i)); //5的二进制是 101
        System.out.println(Integer.toBinaryString(j)); //6的二进制是110
        System.out.println(i^j); //所以 5^6 对每一位进行或运算，得到 011->3
         
        System.out.println(i^0);
        System.out.println(i^i);
    }
}
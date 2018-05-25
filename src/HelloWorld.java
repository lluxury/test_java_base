public class HelloWorld {
    public static void main(String[] args) {
        byte i  =6;
         
        //6的二进制是110
//        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i));
        //6向左移1位后，变成1100，对应的10进制是12
        System.out.println(i<<1);
        //6向右移1位后，变成11，对应的10进制是3
        System.out.println(i>>1);
    }
     
}
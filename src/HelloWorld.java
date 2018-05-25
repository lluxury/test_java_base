import java.util.Scanner;
  
public class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println("读取的字符串是："+a);
    }
}
public class HelloWorld {
 
    public void method1() {
        final int i = 5;
         
        i = 10; //i在第4行已经被赋值过了，所以这里会出现编译错误
         
    }
 
}
public class HelloWorld {
 
    public void method1(int i){ //参数i的作用域即方法method1
        System.out.println(i);
    }
    public void method2(){
 
//        System.out.println(i); //method2 不能访问参数i
    }
     
//    int j = i;  //类里面也不能访问参数i
}
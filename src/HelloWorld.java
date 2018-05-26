public class HelloWorld {
    public static void main(String[] args) {
          
        //打印单数    
        for (int i = 0; i < 10; i++) {
             
            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2){ 
                    break; //如果是双数，结束当前循环
                }
            }
             
        }
         
    }
}
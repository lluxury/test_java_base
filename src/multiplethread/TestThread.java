package multiplethread;
      
import java.awt.GradientPaint;
    
import charactor.Hero;
      
public class TestThread {
      
    public static void main(String[] args) {
    
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
             
        Thread t1 = new Thread(){
            public void run(){
                while(true){
                       
                    //无需循环判断
//                    while(gareen.hp==1){
//                        continue;
//                    }
                       
                    gareen.hurt();
                     
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
   
            }
        };
        t1.start();
   
        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    gareen.recover();
   
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
   
            }
        };
        t2.start();
             
    }
          
}
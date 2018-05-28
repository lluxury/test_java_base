package charactor;
  
import charactor.Support;
  
public class Hero {
    public String name;
    protected float hp;
      
    public static void main(String[] args) {
        Hero h =new Hero();
        ADHero ad = new ADHero();
        Support s =new Support();
          
        h = ad;
        ad = (ADHero) h;
//        h = s;
//        强制转换失败
        ad = (ADHero)h;
    }
      
}
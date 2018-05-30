package generic;
 
import charactor.ADHero;
import charactor.Hero;
 
public class TestGeneric {
 
    public static void main(String[] args) {
 
        Hero h = new Hero();
        ADHero ad = new ADHero();
        //子类转父类
        h = ad;
    }
 
}
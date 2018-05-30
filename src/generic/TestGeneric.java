package generic;
 
import java.util.ArrayList;
 
import property.Item;
 
import charactor.ADHero;
import charactor.APHero;
import charactor.Hero;
 
public class TestGeneric {
 
    public static void main(String[] args) {
        ArrayList<Hero> heros = new ArrayList<Hero>();
         
        //只有作为Hero的子类可以放进去     
        heros.add(new APHero());
        heros.add(new ADHero());
         
        //和Hero无关的类型Item还是放不进去
        heros.add(new Item());
         
    }
}
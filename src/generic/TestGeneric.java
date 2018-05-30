package generic;
 
import java.util.ArrayList;
 
import charactor.APHero;
 
public class TestGeneric {
 
    public static void main(String[] args) {
        ArrayList<APHero> heros = new ArrayList<APHero>();
         
        //只有APHero可以放进去    
        heros.add(new APHero());
         
        //ADHero甚至放不进去
        //heros.add(new ADHero());
         
        //获取的时候也不需要进行转型，因为取出来一定是APHero
        APHero apHero =  heros.get(0);
         
    }
}
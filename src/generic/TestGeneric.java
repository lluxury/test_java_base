package generic;
 
import java.util.ArrayList;
 
import charactor.ADHero;
import charactor.APHero;
import charactor.Hero;
 
public class TestGeneric {
 
    public static void main(String[] args) {
        ArrayList<Hero> hs =new ArrayList<>();
        ArrayList<ADHero> adhs =new ArrayList<>();
 
        //假设能转换成功
//        hs = adhs;
         
        //作为Hero泛型的hs,是可以向其中加入APHero的
        //但是hs这个引用，实际上是指向的一个ADHero泛型的容器
        //如果能加进去，就变成了ADHero泛型的容器里放进了APHero，这就矛盾了
        hs.add(new APHero());
    }
 
}
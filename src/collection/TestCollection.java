package collection;
 
import java.util.ArrayList;
 
import charactor.Hero;
 
public class TestCollection {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
 
        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);
         
        //获取指定位置的对象
        System.out.println(heros.get(5));
        //如果超出了范围，依然会报错
//        System.out.println(heros.get(6));
 
    }
 
}
package charactor;
 
public class Hero {
    public String name;
    protected float hp;
     
    public static void main(String[] args) {
         
        Hero h = new Hero();
         
        ADHero ad = new ADHero();
         
        //类型转换指的是把一个引用所指向的对象的类型，转换为另一个引用的类型
         
        //把ad引用所指向的对象的类型是ADHero
        //h引用的类型是Hero
        //把ADHero当做Hero使用，一定可以
         
        h = ad;
//        引用类型和对象类型不一致 
    }
}
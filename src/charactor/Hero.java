package charactor;
 
import property.LifePotion;
import property.MagicPotion;
   
public class Hero {
    public String name;
    protected float hp;
 
    public void useLifePotion(LifePotion lp){
        lp.effect();
    }
    public void useMagicPotion(MagicPotion mp){
        mp.effect();
    }
//    使用血瓶和魔瓶，就需要为Hero设计两个方法
    public static void main(String[] args) {
         
        Hero garen =  new Hero();
        garen.name = "盖伦";
     
        LifePotion lp =new LifePotion();
        MagicPotion mp =new MagicPotion();
         
        garen.useLifePotion(lp);
        garen.useMagicPotion(mp);
         
    }
       
}
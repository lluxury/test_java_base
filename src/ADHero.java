/**
 * @author yann
 *
 */
public class ADHero extends Hero {
// public class AttackDeamageHero extends Hero {
    /**
     * attack a dadada
     */
    public void attack() {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }
 
    public void attack(Hero h1) {
        System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
    }
    
    
    public void attack(Hero h1, Hero h, Hero h3 ){
    	System.out.println(name + "对" + h3.name + "进行了一次攻击 ");
    
    }
 
    /**
     * @param h1
     * @param h2
     */
    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
    }
    // 方法名是一样的，但是参数类型不一样
    /**
     * @param args
     */
    public static void main(String[] args) {
        ADHero bh = new ADHero();
        bh.name = "赏金猎人";
 
        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";
 
        bh.attack(h1);
        bh.attack(h1, h2);
    }
 
}
package charactor;
 
import property.Weapon;
 
public class Hero {
    private int id;
 
    // public的属性 name
    // 自己可以访问
 
    // 同包子类可以继承
    // 不同包子类可以继承
 
    // 同包类可以访问
    // 不同包类可以访问
    public String name;
 
    protected float hp;
 
    float armor;
 
    int moveSpeed;
 
    public void equip(Weapon w) {
 
    }
 
}
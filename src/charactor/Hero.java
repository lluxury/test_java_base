package charactor;
 
import property.Weapon;
 
public class Hero {
    private int id;
 
    String name;
 
    // 无修饰符的属性 hp
    // 自己可以访问
 
    // 同包子类可以继承
    // 不同包子类不能继承
 
    // 同包类可以访问
    // 不同包类不能访问
    float hp;
 
    float armor;
 
    int moveSpeed;
 
    public void equip(Weapon w) {
 
    }
 
}
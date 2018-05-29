package charactor;
 
/**
 * @author yann
 *
 */
public abstract class Hero {
    String name;
 
    float hp;
 
    float armor;
 
    int moveSpeed;
 
    public static void main(String[] args) {
 
    }
 
    // 抽象方法attack
    // Hero的子类会被要求实现attack方法
    /**
     * attack a da da da
     */
    public abstract void attack();
 
}
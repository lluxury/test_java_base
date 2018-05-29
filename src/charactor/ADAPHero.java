package charactor;
 
public class ADAPHero extends Hero implements AD, AP {
 
    @Override
    public void attack() {
 
        System.out.println("既然可以进行物理攻击，也可以进行魔法攻击");
    }
 
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
 
}
public class Hero {
 
    String name; // 姓名
 
    float hp; // 血量
 
    float armor; // 护甲
 
    int moveSpeed; // 移动速度
 
    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }
 
    // 攻击一个英雄，并让他掉damage点血
    public void attack(Hero hero, int damage) {
        hero.hp = hero.hp - damage;
    }
 
    public static void main(String[] args) {
        Hero teemo = new Hero("提莫", 383);
        Hero garen = new Hero("盖伦", 616);
        garen.attack(teemo, 100);
        System.out.println(teemo.hp);
    }
 
}
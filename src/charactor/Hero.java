package charactor;
 
public class Hero {
    public String name;
    protected float hp;
    float maxHP;
     
    //物品栏的容量
    public static int itemCapacity=8; //声明的时候 初始化
     
    static{
        itemCapacity = 6;//静态初始化块 初始化
    }
     
    public Hero(){
         
    }
     
    public static void main(String[] args) {
        System.out.println(Hero.itemCapacity);
    }
     
}
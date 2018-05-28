package charactor;
 
public class Hero {
    public String name = "some hero"; //声明该属性的时候初始化
    protected float hp;
    float maxHP;
     
    {
        maxHP = 200; //初始化块
    }  
     
    public Hero(){
        hp = 100; //构造方法中初始化
         
    }
     
}
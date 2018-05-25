/**
 * @author yann
 *
 */
public class Hero {
    String name; //姓名
      
    float hp; //血量
      
    float armor; //护甲
      
    int moveSpeed; //移动速度
 
    //坑队友
    void keng(){
        System.out.println("坑队友！");
    }
 
    //获取护甲值
    /**
     * @return armor
     */
    float getArmor(){
        return armor;
    }
     
    //增加移动速度
    void addSpeed(int speed){
        //在原来的基础上增加移动速度
        moveSpeed = moveSpeed + speed;
    }
     
}
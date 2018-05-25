/**
 * @author yann
 *
 */
public class Hero {
    String name; //姓名
      
    float hp; //血量
      
    float armor; //护甲
      
    int moveSpeed; //移动速度
 
    //获取护甲值
    /**
     * @return armor
     */
    float getArmor(){
        return armor;
    }
 
    //坑队友
    void keng(){
        System.out.println("坑队友！");
    }
 
}
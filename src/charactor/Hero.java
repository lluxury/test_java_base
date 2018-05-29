package charactor;
 
public class Hero extends Object {
     
    public static final int itemTotalNumber = 6;//物品栏的数量
        
    String name; //姓名
        
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
     
    public static void main(String[] args) {
 
        final Hero h;
        h  =new Hero();
         
        h.hp = 5;
         
    }
      
}
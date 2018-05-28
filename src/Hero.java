public class Hero {
      
    String name; //姓名
      
    float hp; //血量
      
    float armor; //护甲
      
    int moveSpeed; //移动速度
      
    //有参的构造方法
    //默认的无参的构造方法就失效了
    public Hero(String heroname){ 
        name = heroname;
    }
      
    public static void main(String[] args) {
        Hero garen =  new Hero("盖伦"); 
          
        Hero teemo =  new Hero(); //无参的构造方法“木有了”
    }  
      
}
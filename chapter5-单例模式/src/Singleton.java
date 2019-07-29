/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 11:33
 */
public class Singleton {
    private Singleton(){}

    //方法一
/*    private static Singleton uniqueInstance;
    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }*/

    //方法二
/*    private static Singleton uniqueInstance = new Singleton();
    public static Singleton getInstance(){
        return uniqueInstance;
    }*/
}

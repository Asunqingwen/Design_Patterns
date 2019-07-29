package Equipment;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 15:08
 */
public class Light {
    private String postion;

    public Light(String postion){
        this.postion = postion;
    }

    public void on() {
        System.out.println("Light is On!");
    }

    public void off() {
        System.out.println("Light is Off!");
    }

}

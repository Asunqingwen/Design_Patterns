package Equipment;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 15:17
 */
public class GarageDoor {
    private String positon;

    public GarageDoor(String positon) {
        this.positon = positon;
    }

    public void open() {
        System.out.println("Garage door is Open!");
    }
}

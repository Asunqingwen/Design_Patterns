package Equipment;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 16:32
 */
public class Stereo {
    private String position;

    public Stereo(String position){
        this.position = position;
    }

    public void on() {
        System.out.println("Stereo is on!");
    }

    public void setCD() {
        System.out.println("Put a CD in the Stereo!");
    }

    public void setVolume(int volume) {
        System.out.println("The volume of Stereo is " + volume);
    }
}

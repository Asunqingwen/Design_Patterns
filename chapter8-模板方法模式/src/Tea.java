/**
 * @author sqw123az@sina.com
 * @date 2019/7/30 0030 15:24
 */
public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}

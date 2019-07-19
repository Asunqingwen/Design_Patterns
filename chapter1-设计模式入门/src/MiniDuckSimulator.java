import Duck.Duck;
import Duck.MallardDuck;
import Duck.ModelDuck;
import Fly.FlyRocketPowered;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/18 0018 17:08
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

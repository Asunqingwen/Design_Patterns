package Duck;

import Duck.Turkey;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/30 0030 9:29
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}

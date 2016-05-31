package Builder_Pattern.Extends_Items;

import Builder_Pattern.Item_Impl.Burger;

/**
 * Created by Jordan on 5/31/2016.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}

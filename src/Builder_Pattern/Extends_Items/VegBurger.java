package Builder_Pattern.Extends_Items;

import Builder_Pattern.Item_Impl.Burger;

/**
 * Created by Jordan on 5/31/2016.
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}

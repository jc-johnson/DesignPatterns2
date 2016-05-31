package Builder_Pattern.Extends_Items;

import Builder_Pattern.Item_Impl.ColdDrink;

/**
 * Created by Jordan on 5/31/2016.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}

package Builder_Pattern.Extends_Items;

import Builder_Pattern.Item_Impl.ColdDrink;

/**
 * Created by Jordan on 5/31/2016.
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}

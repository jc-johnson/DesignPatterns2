package Builder_Pattern.Item_Impl;

import Builder_Pattern.Interfaces.Item;
import Builder_Pattern.Interfaces.Packing;
import Builder_Pattern.Packing_Impl.Bottle;

/**
 * Created by Jordan on 5/31/2016.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();


}

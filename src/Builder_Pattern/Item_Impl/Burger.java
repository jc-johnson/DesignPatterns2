package Builder_Pattern.Item_Impl;

import Builder_Pattern.Interfaces.Item;
import Builder_Pattern.Interfaces.Packing;
import Builder_Pattern.Packing_Impl.Wrapper;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

/**
 * Created by Jordan on 5/31/2016.
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

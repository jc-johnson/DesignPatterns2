package Builder_Pattern;

import Builder_Pattern.Extends_Items.ChickenBurger;
import Builder_Pattern.Extends_Items.Coke;
import Builder_Pattern.Extends_Items.Pepsi;
import Builder_Pattern.Extends_Items.VegBurger;


/**
 * Created by Jordan on 5/31/2016.
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

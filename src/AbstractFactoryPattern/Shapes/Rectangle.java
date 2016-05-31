package AbstractFactoryPattern.Shapes;

import AbstractFactoryPattern.Interfaces.Shape;

/**
 * Created by Jordan on 5/30/2016.
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("I'm a rectangle!");
    }
}

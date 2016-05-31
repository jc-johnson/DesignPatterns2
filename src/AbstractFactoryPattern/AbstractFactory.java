package AbstractFactoryPattern;

import AbstractFactoryPattern.Interfaces.Color;
import AbstractFactoryPattern.Interfaces.Shape;

/**
 * Created by Jordan on 5/30/2016.
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}

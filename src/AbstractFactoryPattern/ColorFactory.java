package AbstractFactoryPattern;

import AbstractFactoryPattern.Colors.Blue;
import AbstractFactoryPattern.Colors.Green;
import AbstractFactoryPattern.Colors.Red;
import AbstractFactoryPattern.Interfaces.Color;
import AbstractFactoryPattern.Interfaces.Shape;

/**
 * Created by Jordan on 5/30/2016.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}

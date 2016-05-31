package AbstractFactoryPattern;

import AbstractFactoryPattern.Interfaces.Color;
import AbstractFactoryPattern.Interfaces.Shape;
import AbstractFactoryPattern.Shapes.Circle;
import AbstractFactoryPattern.Shapes.Rectangle;
import AbstractFactoryPattern.Shapes.Square;

/**
 * Created by Jordan on 5/30/2016.
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {

        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        if(shapeType.equals("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}

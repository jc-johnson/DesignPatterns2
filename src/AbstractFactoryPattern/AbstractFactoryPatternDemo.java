package AbstractFactoryPattern;

import AbstractFactoryPattern.Interfaces.Color;
import AbstractFactoryPattern.Interfaces.Shape;

/**
 * Created by Jordan on 5/30/2016.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        // get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        // call draw method of Shape Circle
        shape1.draw();

        // get an object of Shape rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        // call draw method of Shape Rectangle
        shape2.draw();

        // create shape object from shape factory
        Shape shape3 = shapeFactory.getShape("SQUARE");

        // draw shape 3, which is a square
        shape3.draw();

        // get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // get Red color object
        Color color1 = colorFactory.getColor("RED");

        // call fill method for color red
        color1.fill();

        // get Blue color object
        Color color2 = colorFactory.getColor("BLUE");

        // call Blue's fill method
        color2.fill();

        // get Green color object
        Color color3 = colorFactory.getColor("GREEN");

        // call color3's fill method
        color3.fill();

    }
}

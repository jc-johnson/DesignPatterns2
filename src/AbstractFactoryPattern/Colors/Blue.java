package AbstractFactoryPattern.Colors;

import AbstractFactoryPattern.Interfaces.Color;

/**
 * Created by Jordan on 5/30/2016.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with Blue!");
    }
}

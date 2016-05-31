package FactoryPattern;

/**
 * Created by jordan on 5/29/16.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside circle::draw() method.");
    }
}

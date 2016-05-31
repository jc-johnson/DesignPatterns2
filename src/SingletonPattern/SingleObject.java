package SingletonPattern;

/**
 * Created by Jordan on 5/30/2016.
 */
public class SingleObject {

    // create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    /**
     * make the constructor private so that this class
     * can't be instantiated
     */
    private SingleObject(){}

    // get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World! I'm a Singleton!");
    }
}

package SingletonPattern;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by Jordan on 5/30/2016.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        // illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        // get the only object available
        SingleObject object = SingleObject.getInstance();

        // show the message
        object.showMessage();
    }
}

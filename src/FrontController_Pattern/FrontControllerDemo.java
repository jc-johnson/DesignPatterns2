package FrontController_Pattern;

/**
 * Created by Jordan on 5/31/2016.
 */
public class FrontControllerDemo {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}

package FrontController_Pattern;

import FrontController_Pattern.Views.HomeView;
import FrontController_Pattern.Views.StudentView;

import javax.xml.ws.Dispatch;

/**
 * Created by Jordan on 5/31/2016.
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        } else {
            homeView.show();
        }
    }
}

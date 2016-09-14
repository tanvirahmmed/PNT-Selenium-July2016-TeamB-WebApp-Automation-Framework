package LogIn;

import methods.CommonMethods;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by AFMErshadul on 9/8/2016.
 */
public class ULogIn extends CommonMethods {
    @Test(priority = 1)
    public void Login() throws Exception {
        //initialize Search page factory
        sleepFor(1);
        clickByXpath(".//*[@id='nav-link-yourAccount']/span[2]");
        sleepFor(2);
        UserLogin();
    }
}

package home.login;

import FacebookPageFactory.FacebookHomePage;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by rinko on 8/31/2016.
 */
public class UserLoginFacebook extends Base{


    @Test
    public void faceBookLogin()throws IOException,InterruptedException {
        //initialize Search page factory
        FacebookHomePage userLogin =  PageFactory.initElements(driver, FacebookHomePage.class); //new UserLoginPage();
        userLogin.faceBookLogin("rinko.ewu@gmail.com","Rinko11435");
        sleepFor(50);


    }


}

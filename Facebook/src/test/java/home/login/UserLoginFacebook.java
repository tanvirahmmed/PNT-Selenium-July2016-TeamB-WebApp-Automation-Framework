package home.login;

import FacebookPageFactory.FacebookHomePage;
import common.Base;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by rinko on 8/31/2016.
 */
public class UserLoginFacebook extends Base{



    public void faceBookLogin()throws IOException,InterruptedException {
        //initialize Search page factory
        FacebookHomePage userLogin =  PageFactory.initElements(driver, FacebookHomePage.class);
        userLogin.faceBookLogin("9293517459","rinko321");
        sleepFor(5);


    }


}

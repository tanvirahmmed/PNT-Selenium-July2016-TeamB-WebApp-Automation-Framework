package home.login;

import FacebookPageFactory.FacebookHomePage;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by rinko on 8/31/2016.
 */
public class FacebookNewReg extends Base{
    @Test
    public void faceBookLogin()throws IOException,InterruptedException {
        //initialize Search page factory

        FacebookHomePage userLogin =  PageFactory.initElements(driver, FacebookHomePage.class); //new UserLoginPage();
        String RegDataArray [] = {"Tanvir","Ahmmed","+16476373736","3","","","",""};
        userLogin.faceBookReg(RegDataArray);
        sleepFor(1);

    }
}

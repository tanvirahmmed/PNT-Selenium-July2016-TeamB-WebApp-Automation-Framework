package home.search;

import MyTargetPageFactory.TargetHomePage;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by rinko on 9/2/2016.
 */
public class MyTargetStoreLogin extends Base {

    @Test
    public void myTargetStoreLogin() throws Exception {
        //initialize Search page factory
         TargetHomePage targetLogin =  PageFactory.initElements(driver, TargetHomePage.class); //new UserLoginPage();
        targetLogin.myTargetLogin("rinko.ewu@gmail.com","Rinko321");
        sleepFor(10);


    }
}

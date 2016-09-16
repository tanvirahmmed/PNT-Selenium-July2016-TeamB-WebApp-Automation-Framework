package LogIn;


import methods.CommonMethods;
import org.testng.annotations.Test;
import pageFactory.LogInInfo;

import java.io.IOException;

/**
 * Created by AFMErshadul on 9/7/2016.
 */
public class AmazonLogIn extends CommonMethods {

        @Test(priority = 1)
        public void Login()throws IOException,InterruptedException {
            //initialize Search page factory
                sleepFor(1);
                clickByXpath(".//*[@id='nav-link-yourAccount']/span[2]");
                sleepFor(2);
                LogInInfo login = new LogInInfo(driver); // creating object of main login class
                login.EmailID().sendKeys("nahreen789@gmail.com");
                sleepFor(1);
                login.password().sendKeys("0606440");
                login.Submit().click();
                sleepFor(5);
                //clickByXpath(".//*[@id='nav-link-yourAccount']/span[2]");
                sleepFor(2);
                mouseHoverByXpath(".//*[@id='nav-link-yourAccount']/span[2]");
                //waitUntilVisible(By.cssSelector(".nav-a.nav-a-2.nav-truncate"));
                sleepFor(3);
                clickByXpath(".//*[@id='nav-item-signout']/span");
                sleepFor(7);

            }



        }



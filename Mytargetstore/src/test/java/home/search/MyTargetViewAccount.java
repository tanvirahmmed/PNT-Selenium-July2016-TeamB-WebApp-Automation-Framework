package home.search;

import CommonMethods.CommonMyTargetMethods;
import org.testng.annotations.Test;

/**
 * Created by rinko on 9/2/2016.
 */
public class MyTargetViewAccount extends CommonMyTargetMethods {


    @Test
    public void myTargetAccountView() throws Exception {

        MemberLogin();
        //MemberLogOut();
        clickByXpath("//*[@id='js-toggleRightNavLg']");
        sleepFor(2);
        clickByXpath("//*[@id='rightNavigation']/ul/li[1]/a");
        sleepFor(10);
        MemberLogOut();;
        sleepFor(20);

         //MyTargetStoreLogin objLogin = new MyTargetStoreLogin();
       // objLogin.myTargetStoreLogin();


      //  TargetHomePage targetLogin =  PageFactory.initElements(driver, TargetHomePage.class); //new UserLoginPage();
      //  targetLogin.myTargetLogin("rinko.ewu@gmail.com","Rinko321");
       // sleepFor(10);

       /* clickByXpath("//*[@id='js-toggleRightNavLg']");
        sleepFor(2);
        clickByXpath("//*[@id='rightNav-signIn']");
        sleepFor(2);
        typeByXpath("//*[@id='logonIdSide']","rinko.ewu@gmail.com");
        sleepFor(2);
        typeByXpath("//*[@id='logonPasswordSide']","Rinko321");
        sleepFor(2);

        clickByXpath("//*[@id='signin-btn']");
        sleepFor(2);
        */

       // CommonMyTargetMethods commMethods = new CommonMyTargetMethods();
       // commMethods.MemberLogin();

     /*   clickByXpath("//*[@id='js-toggleRightNavLg']/i");
        sleepFor(2);

        clickByXpath("//*[@id='rightNavigation']/ul/li[1]/a");
        sleepFor(10);*/



        //clickByXpath("//*[@id='guest-sign-out']");
        //sleepFor(10);













    }
}

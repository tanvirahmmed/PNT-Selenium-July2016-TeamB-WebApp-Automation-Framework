package home.search;

import CommonMethods.CommonMyTargetMethods;
import org.testng.annotations.Test;

/**
 * Created by rinko on 9/2/2016.
 */
public class MyTargetUserReg extends CommonMyTargetMethods {
    @Test
    public void myTargetReg() throws Exception {

      // Test Data Grab from MySQL Database for Registrations

        String [] getRegData = getRegistrationTestData();

        clickByXpath("//*[@id='js-toggleRightNavLg']");
        sleepFor(2);
        clickByXpath("//*[@id='rightNav-createAccount']");
        typeByXpath("//*[@id='newEmailSide']",getRegData[2]);
        sleepFor(2);
        typeByXpath("//*[@id='firstNameSide']",getRegData[0]);
        sleepFor(2);
        typeByXpath("//*[@id='lastNameSide']",getRegData[1]);
        typeByCss(".js-adaptiveInput.js-newAccLogonPassword",getRegData[3]);
        clickByXpath("//*[@id='guest-registration-form']/div[6]/button");
        sleepFor(10);



    }
}

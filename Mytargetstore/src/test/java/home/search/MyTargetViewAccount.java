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
        clickByXpath("//*[@id='js-toggleRightNavLg']");
        sleepFor(2);
        clickByXpath("//*[@id='rightNavigation']/ul/li[1]/a");
        sleepFor(10);
        MemberLogOut();;
        sleepFor(20);
    }
}

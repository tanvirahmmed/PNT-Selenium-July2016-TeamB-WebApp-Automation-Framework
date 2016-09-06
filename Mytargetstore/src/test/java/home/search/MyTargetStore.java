package home.search;

import org.testng.annotations.Test;

/**
 * Created by rinko on 9/2/2016.
 */
public class MyTargetStore extends MyTargetViewAccount {
    @Test
    public void myTargetStore() throws Exception {


       // MemberLogin();
        //MemberLogOut();

        myTargetAccountView();
        clickByXpath("//*[@id='js-myStoreTiles']/span[1]");
        sleepFor(2);
       // clickByXpath("//*[@id='rightNavigation']/ul/li[1]/a");
        //sleepFor(2);
    }

}

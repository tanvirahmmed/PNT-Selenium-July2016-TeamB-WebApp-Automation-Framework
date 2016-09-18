package home.search;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by rinko on 9/2/2016.
 */
public class MyTargetLinkTest extends Base {
    @Test(priority=1)
    public void ViewWeeklyAds() throws Exception {

        clickByXpath("//*[@id='headerTop']/header/nav/ul/li[1]/a");
        sleepFor(3);
        clickByCss(".btn.btn-primary.ng-binding");
        sleepFor(3);
        for (int i = 0; i < 10; i++) {
            clickByXpath("html/body/div[1]/main/div/div/section/div[4]/button[2]");
            sleepFor(2);
        }
    }


        @Test(priority=2)
        public void ViewDeals()  throws Exception {
            clickByXpath("//*[@id='js-toggleSecondaryNav']");
            sleepFor(2);
            clickByXpath("//*[@id='secondaryNavigation']/ul/li[1]/a");
           sleepFor(3);
        }




    }


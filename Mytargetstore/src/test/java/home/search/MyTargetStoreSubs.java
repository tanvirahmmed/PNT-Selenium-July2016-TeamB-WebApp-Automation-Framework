package home.search;

import org.testng.annotations.Test;

/**
 * Created by rinko on 9/2/2016.
 */
public class MyTargetStoreSubs  extends  MyTargetViewAccount{

    @Test
    public void myTargetSubListView() throws Exception {
        myTargetAccountView();
        clickByXpath("//*[@id='js-subscriptionTiles']/span[1]");
        sleepFor(10);

    }
}



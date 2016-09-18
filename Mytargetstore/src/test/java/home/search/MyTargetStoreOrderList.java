package home.search;

import org.testng.annotations.Test;

/**
 * Created by rinko on 9/2/2016.
 */
public class MyTargetStoreOrderList extends MyTargetViewAccount
{
    @Test
    public void myTargetOrderListView() throws Exception {
        myTargetAccountView();
        clickByXpath("//*[@id='js-orderTiles']/span");
        sleepFor(10);
    }


}

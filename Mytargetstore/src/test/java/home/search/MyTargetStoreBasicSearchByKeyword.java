package home.search;

import MyTargetPageFactory.TargetHomePage;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by rinko on 9/2/2016.
 */
public class MyTargetStoreBasicSearchByKeyword extends Base {

    @Test
    public void myTargetStoreBasicSearch()throws IOException,InterruptedException {
        //initialize Search page factory
        TargetHomePage targetSearch =  PageFactory.initElements(driver, TargetHomePage.class); //new UserLoginPage();
        targetSearch.myTargetStoreBasicSearch("beats headphones");
        sleepFor(10);


    }
}

package home.search;

import MyTargetPageFactory.TargetHomePage;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;

/**
 * Created by rinko on 9/2/2016.
 */
public class MyTargetStoreDynamicKeywordSearch extends Base {

    @Test
    public void myTargetStoreBasicSearch()throws IOException,InterruptedException {
        //initialize Search page factory
        TargetHomePage targetSearch =  PageFactory.initElements(driver, TargetHomePage.class); //new UserLoginPage();
        DataReader dr = new DataReader();
        String path = System.getProperty("user.dir")+"/DataTest/file1.xls";
        String [] st = dr.fileReader(path);
        for(String read:st) {
            targetSearch.myTargetStoreBasicSearch(read);
            sleepFor(2);
            targetSearch.clearSearchInput();
        }
    }
}

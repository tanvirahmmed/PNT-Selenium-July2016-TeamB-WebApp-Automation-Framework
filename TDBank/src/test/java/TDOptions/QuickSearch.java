package TDOptions;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageFactory2.SearchService;

import java.io.IOException;

/**
 * Created by AFMErshadul on 9/8/2016.
 */
public class QuickSearch extends Base {
    @Test
    public void myTargetStoreBasicSearch()throws IOException,InterruptedException {
        //initialize Search page factory
        SearchService QSearch =  PageFactory.initElements(driver, SearchService.class);
        QSearch.searchFor("Investments");
        sleepFor(5);


    }
}

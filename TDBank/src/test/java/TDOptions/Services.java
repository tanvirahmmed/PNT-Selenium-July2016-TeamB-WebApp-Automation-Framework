package TDOptions;

import InfoSearch.ServicesToBeSearched;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageFactory2.SearchService;
import utility.DataReader;

import java.io.IOException;

/**
 * Created by AFMErshadul on 9/8/2016.
 */
public class Services extends Base{
    @Test
    public void TDSearch()throws IOException,InterruptedException {
        //initialize Search page factory
        SearchService SearchTD =  PageFactory.initElements(driver, SearchService.class); //new UserLoginPage();

        DataReader dr = new DataReader();
        String path = System.getProperty("user.dir")+"/data2/file1.xls";
        String [] st = dr.fileReader(path);
        for(String read:st) {
            SearchTD.searchFor(read);
            sleepFor(2);
            SearchTD.clearSearchInput();
        }

        //  sleepFor(10);


    }

}

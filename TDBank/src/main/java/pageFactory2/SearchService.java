package pageFactory2;

import common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by AFMErshadul on 9/8/2016.
 */
public class SearchService extends Base{
    @FindBy(how = How.CSS, using = "#txtSearch")
    public static WebElement searchInput;

    @FindBy(how = How.CSS, using = "#btnAsk")
    public static WebElement searchSubmit ;

    public void searchFor(String item){
        searchInput.sendKeys(item, Keys.ENTER);
    }
    public void clearSearchInput(){
        searchInput.clear();
    }
}


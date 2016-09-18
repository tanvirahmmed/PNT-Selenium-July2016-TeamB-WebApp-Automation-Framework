package Factory.Search;

import common.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends Base{

    WebDriver driver;
    public Search (WebDriver driver) {
        this.driver = driver;
    }

    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE

    @FindBy(css = "#global-search-trigger")
    public static WebElement clickonSearch;

    @FindBy(css = ".search-box")
    public static WebElement typeSearch;

    @FindBy(xpath = ".btn-search")
    public static WebElement clickOnSearch;



    // ALL THE METHODS GOES HERE
    // ALL THE METHODS GOES HERE
    // ALL THE METHODS GOES HERE

    public void readNews(String search) throws InterruptedException {

        sleepFor(5);
        clickOnSearch.click();
        typeSearch.sendKeys(search);
        clickOnSearch.click();

    }
}

package Factory.Search;

import common.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Search extends Base{

    WebDriver driver;
    public Search (WebDriver driver) {
        this.driver = driver;
    }

    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE

    @FindBy(xpath = "//*[@id=\"global-nav\"]/ul/li[1]/a")
    public static WebElement electionTab;

    @FindBy(xpath = "//*[@id=\"global-nav\"]/ul/li[2]/a")
    public static WebElement usTab;

    @FindBy(xpath = ".//*[@id='global-nav']/ul/li[3]/a")
    public static WebElement worldTab;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-nav']/ul/li[4]/a")
    public static WebElement entertainmentTab;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-nav']/ul/li[5]/a")
    public static WebElement healthTab;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-nav']/ul/li[6]/a")
    public static WebElement techTab;

    // ALL THE METHODS GOES HERE
    // ALL THE METHODS GOES HERE
    // ALL THE METHODS GOES HERE

    public void readNews(String title) throws InterruptedException {

        sleepFor(5);
        techTab.click();
        sleepFor(5);
        Assert.assertTrue(driver.getTitle().contains(title), "Tech tab is not working!");
    }
}

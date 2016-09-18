package Factory.Tabs;
import common.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class Tabs extends Base{

    WebDriver driver;
    public Tabs (WebDriver driver) {
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

    public void tabs() throws InterruptedException {
        sleepFor(5);
        electionTab.click();
        sleepFor(5);
        usTab.click();
        sleepFor(5);
        worldTab.click();
        sleepFor(5);
        entertainmentTab.click();
        sleepFor(5);
        healthTab.click();
        sleepFor(5);
        techTab.click();
        sleepFor(5);
    }
}
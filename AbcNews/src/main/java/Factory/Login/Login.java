package Factory.Login;
import common.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class Login extends Base {

    WebDriver driver;
    public Login (WebDriver driver) {
        this.driver = driver;
    }

    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE

    @FindBy(xpath = ".//*[@id='global-header']/div[2]/ul/li[2]/a[1]")
    public static WebElement clickOnLogIn;

    @FindBy(css = "#disneyid-iframe")
    public static WebElement iframeID;

    @FindBy(how = How.XPATH, using = "//input [@type='email']")
    public static WebElement typeEmail;

    @FindBy(how = How.XPATH, using = "//input [@type='password']")
    public static WebElement typePassword;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public static WebElement clickOnSubmitForm;

    // ALL THE METHODS GOES HERE
    // ALL THE METHODS GOES HERE
    // ALL THE METHODS GOES HERE

    public void login (String email, String password) throws InterruptedException {
        sleepFor(3);
        clickOnLogIn.click();
        sleepFor(2);
        driver.switchTo().frame(iframeID);
        sleepFor(1);
        typeEmail.sendKeys(email);
        typePassword.sendKeys(password);
        sleepFor(1);
        clickOnSubmitForm.click();
    }
}
package FACROTY.CreateAnAccount;
import common.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class CreateAnAccount extends Base {

    WebDriver driver;
    public CreateAnAccount(WebDriver ldriver) {
        this.driver = ldriver;
    }

    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE

    @FindBy(css = ".account")
    public static WebElement clickOnCreateAccount;

    @FindBy(css = "#fld-firstName")
    public static WebElement typeFirstName;

    @FindBy(css = "#fld-lastName")
    public static WebElement typeLaseName;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-e']")
    public static WebElement typeEmail;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-p1']")
    public static WebElement typePassword;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-p2']")
    public static WebElement reTypePassword;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-phone']")
    public static WebElement typePhoneNumber;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public static WebElement clickOnSubmitForm;

    // ALL THE METHODS GOES HERE
    // ALL THE METHODS GOES HERE
    // ALL THE METHODS GOES HERE

    public void createAccount(String firstName, String lastName,String email,String password,String phoneNumber) throws InterruptedException {
        sleepFor(2);
        clickOnCreateAccount.click();
        //sleepFor(2);
        typeFirstName.sendKeys(firstName);
        //sleepFor(2);
        typeLaseName.sendKeys(lastName);
        //sleepFor(2);
        typeEmail.sendKeys(email);
        //sleepFor(2);
        typePassword.sendKeys(password);
        //sleepFor(2);
        reTypePassword.sendKeys(password);
        //sleepFor(2);
        typePhoneNumber.sendKeys(phoneNumber);
        //sleepFor(2);
        clickOnSubmitForm.click();
        sleepFor(5);
    }
}
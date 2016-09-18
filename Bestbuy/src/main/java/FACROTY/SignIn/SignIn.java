package FACROTY.SignIn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class SignIn {


    WebDriver driver;
    public SignIn (WebDriver driver) {
        this.driver = driver;
    }

    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE

    @FindBy(xpath = "//span[text()='Sign In']")
    public static WebElement clickOnSignIn;

//    @FindBy(css = "")
//    public static WebElement typeFirstName;
//
//    @FindBy(css = "")
//    public static WebElement typeLaseName;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-e']")
    public static WebElement typeEmail;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-p1']")
    public static WebElement typePassword;

//    @FindBy(how = How.XPATH, using = "")
//    public static WebElement reTypePassword;
//
//    @FindBy(how = How.XPATH, using = "")
//    public static WebElement typePhoneNumber;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public static WebElement clickOnSubmitForm;

    // ALL THE METHODS GOES HERE
    // ALL THE METHODS GOES HERE
    // ALL THE METHODS GOES HERE

    public void signIn(String email, String password) throws InterruptedException {
        Thread.sleep(2000);
        clickOnSignIn.click();
        //Thread.sleep(2000);
        //typeFirstName.sendKeys(firstName);
        //sleepFor(2);
        //typeLaseName.sendKeys(lastName);
        //sleepFor(2);
        typeEmail.sendKeys(email);
        //sleepFor(2);
        typePassword.sendKeys(password);
        //sleepFor(2);
        //reTypePassword.sendKeys(password);
        //sleepFor(2);
        //typePhoneNumber.sendKeys(phoneNumber);
        //sleepFor(2);
        clickOnSubmitForm.click();
        //Thread.sleep(10000);
    }
}

package FACROTY.FineStore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindStore {


    WebDriver driver;
    public FindStore (WebDriver driver) {
        this.driver = driver;
    }

    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE

    @FindBy(xpath = "//a[@data-lid='hdr_stl']")
    public static WebElement clickOnStoreLocator;

    @FindBy(xpath = "//input[@id='zip-city-state']")
    public static WebElement typeZipCode;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public static WebElement clickOnSubmitForm;

    public void findStore(String zipcode) throws InterruptedException {
        Thread.sleep(1000);
        clickOnStoreLocator.click();
        Thread.sleep(1000);
        typeZipCode.sendKeys(zipcode);
        clickOnSubmitForm.click();
        Thread.sleep(10000);

    }
}
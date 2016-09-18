package FACROTY.AddToCart;

import common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddToCart extends Base{


    WebDriver driver;
    public AddToCart (WebDriver driver) {
        this.driver = driver;
    }

    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE
    // ALL THE LOCATORS GOES HERE

    @FindBy(xpath = "//input[@id='gh-search-input']")
    public static WebElement typeSearchItem;

    @FindBy(how = How.XPATH, using = ".//*[@id='main-results']/div[3]/div[1]/div/div[3]/div/div[1]/div[2]/div[2]/a/span[2]")
    public static WebElement clickAddToCart;

    @FindBy(css = ".header-icon-cart")
    public static WebElement goToCart;

    // ALL THE METHODS GOES HERE
    // ALL THE METHODS GOES HERE
    // ALL THE METHODS GOES HERE

    public void addToCart(String item) throws InterruptedException {
        typeSearchItem.sendKeys(item, Keys.ENTER);
        clickAddToCart.click();
      // iframeHandle(driver.findElement(By.cssSelector("div.main")));
        //sleepFor(5);
        sleepFor(5);
        clickByXpath("//div [@class='modal-content-vcenter']");
        goToCart.click();
        sleepFor(10);
    }
}

package Test_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Factory_Test {
    WebDriver driver;

    public Factory_Test(WebDriver ldriver) {
        this.driver = ldriver;
    }

    @FindBy(css = ".account")            //SPAN[@class ='account']")
    WebElement clickOnCreateAccount;

    @FindBy(css = "#fld-firstName")
    WebElement typeFirstName;


    public void justClick() throws InterruptedException {
        Thread.sleep(2000);
        clickOnCreateAccount.click();
        Thread.sleep(2000);
        typeFirstName.sendKeys("hello");
        Thread.sleep(2000);

    }
}


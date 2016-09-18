package StoreInDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class StoreInDatabase {

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search Best Buy']")
    public static WebElement searchInput;

    @FindBy(how = How.XPATH, using = "//li[@class='sku-id']")
    public static List<WebElement> allSKU;

    @FindBy(how = How.XPATH, using = "//*[@id='model-value']")
    public static List<WebElement> allmodel;

    public void searchFor(String item){
        searchInput.sendKeys(item, Keys.ENTER);
    }
}
